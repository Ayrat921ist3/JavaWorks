package ru.khannanovayrat.test;

import org.junit.Before;
import org.junit.Test;
import ru.khannanovayrat.generics.Q;
import ru.khannanovayrat.models.X;
import ru.khannanovayrat.models.Y;
import ru.khannanovayrat.models.Z;

import static org.junit.Assert.*;

/**
 * Created by Ayrat on 05.10.2016.
 */
public class QTest {
    private X xTest;
    private Y yTest;
    private Z zTest;

    private static final int X_VALUE = 3;
    private static final int Y_VALUE = 5;
    private static final int Z_VALUE = 10;

    private Q<X, Y, Z> qTest;

    @Before
    public void setUp(){
        xTest = new X(X_VALUE);
        yTest = new Y(Y_VALUE);
        zTest = new Z(Z_VALUE);
        qTest = new Q<>(xTest, yTest, zTest);
    }

    @Test
    public void allCalc() throws Exception {
        int expected = 44;
        int actual = qTest.allCalc();
        assertEquals(expected, actual);
    }

}