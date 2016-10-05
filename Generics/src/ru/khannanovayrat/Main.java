package ru.khannanovayrat;

import ru.khannanovayrat.generics.Q;
import ru.khannanovayrat.models.X;
import ru.khannanovayrat.models.Y;
import ru.khannanovayrat.models.Z;

public class Main {

    public static void main(String[] args) {

        X x = new X(4);
        Y y = new Y(6);
        Z z = new Z(10);

        Q<X, Y, Z> qObj = new Q<>(x, y, z);

        System.out.println(qObj.allCalc());
    }
}
