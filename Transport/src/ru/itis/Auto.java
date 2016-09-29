package ru.itis;

/**
 * Created by KFU-user on 29.09.2016.
 */
public class Auto extends Transport {

    int gasNumber;

    public Auto(int wheelsCount, int gasNumber) {
        super(wheelsCount);
        this.gasNumber = gasNumber;
    }

    @Override
    public void go() {
        System.out.println("I'm auto");
    }
}
