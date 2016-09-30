package ru.itis;

public class Main {

    public static void main(String[] args) {
	    IntegerArrayList arrayList = new IntegerArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
//        arrayList.add(10);

        arrayList.debugPrint();

        arrayList.add(0, 5);

        arrayList.debugPrint("Added to position 5");

        arrayList.delete(7);

        arrayList.debugPrint("Delete 7");

        arrayList.deleteByPosition(2);

        arrayList.debugPrint("Delete by position 2");

        System.out.println("Element 8 position " + arrayList.find(8));

    }
}
