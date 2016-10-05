package ru.khannanovayrat.models;

/**
 * Created by Ayrat on 05.10.2016.
 */
public class Y implements B {

    private int y;

    public Y(int y) {
        this.y = y;
    }

    @Override
    public int calc2() {
        return y * y;
    }
}
