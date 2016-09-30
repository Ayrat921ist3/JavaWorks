package ru.itis;

/**
 * Created by KFU-user on 30.09.2016.
 */
public class IntegerArrayList {

    private static final int MAX_SIZE = 10;

    private int count;
    private int[] data;

    public IntegerArrayList() {
        this.count = 0;
        this.data = new int[MAX_SIZE];
    }

    public IntegerArrayList(int originalData[]){
        if(originalData.length <= MAX_SIZE){
            this.data = new int[MAX_SIZE];
            this.count = originalData.length;
            for (int i = 0; i < originalData.length; i++){
                this.data[i] = originalData[i];
            }
        }else throw new IllegalArgumentException();
    }

    /**
     * Метод добавления элемента в список
     * @param element - элемент
     * @throws IllegalArgumentException
     */
    public void add(int element){
        if(this.count < MAX_SIZE){
            this.data[count] = element;
            count++;
        }else throw new IllegalArgumentException();
    }

    /**Элементы правее сдвигаются вправо
     *
     * @param element
     * @param position
     */
    public void add(int element, int position){
        if(position < count && count < MAX_SIZE){
            int temp = this.data[position];
            this.data[position] = element;
            int curr;
            for (int i = position + 1; i < count + 1; i++){
                curr = data[i];
                this.data[i] = temp;
                temp = curr;
            }
            count++;
        }
    }

    public void debugPrint(String msg){
        System.out.println(msg);
        for(int i = 0; i < count; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public void debugPrint(){
        for(int i = 0; i < count; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public boolean delete(int element){
        for (int i = 0; i < count; i++){
            if(data[i] == element){
                for (int j = i; j < data.length - 1; j++){
                    data[j] = data[j + 1];
                }
                count--;
                return true;
            }
        }
        return false;
    }

    public boolean deleteByPosition(int position){
        if(position < count){
            for (int i = position; i < count - 1; i++){
                data[i] = data[i + 1];
            }
            count--;
            return true;
        }
        return false;
    }

    /**
     *
     * @param element
     * @return индекс, -1, если не найден
     */
    public int find(int element){
        for(int i = 0; i < count; i++){
            if(data[i] == element){
                return i;
            }
        }
        return  -1;
    }

    public int get(int position){
        if(position < count){
            return this.data[position];
        }else throw new IllegalArgumentException();
    }

    public int[] getData() {
        int[] data = new int[count];
        for (int i = 0; i < count; i++){
            data[i] = this.data[i];
        }
        return data;
    }
}
