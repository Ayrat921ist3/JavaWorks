package ru.itis;

/**
 * Created by KFU-user on 29.09.2016.
 */
public class Bike extends Transport {

    public Bike(int wheelsCount) {
        super(wheelsCount);
    }

    @Override
    public void go() {
        System.out.println("I'm Bike");
    }

    @Override
    public String toString() {
        return "Bike";
    }
}
