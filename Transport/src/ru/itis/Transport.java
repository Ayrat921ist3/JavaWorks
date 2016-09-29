package ru.itis;

/**
 * Created by KFU-user on 29.09.2016.
 */
public abstract class Transport {

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    private int wheelsCount;

    public Transport(int wheelsCount){
        this.wheelsCount = wheelsCount;
    }

    public abstract void go();

    @Override
    public String toString() {
        return "Transport";
    }
}
