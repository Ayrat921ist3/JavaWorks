package ru.khannanovayrat.models;

/**
 * Created by Ayrat on 05.10.2016.
 */
public class X implements B {

    private int x;

    public X(int x) {
        this.x = x;
    }

    @Override
    public int calc2() {
        return x * x;
    }
}
