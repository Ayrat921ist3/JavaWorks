package ru.khannanovayrat.generics;


import ru.khannanovayrat.models.B;
import ru.khannanovayrat.models.D;

/**
 * Created by Ayrat on 05.10.2016.
 */
public class Q<X extends B,Y extends B,Z extends D> {

    private X xObj;
    private Y yObj;
    private Z zObj;

    public Q(X xObj, Y yObj, Z zObj) {
        this.xObj = xObj;
        this.yObj = yObj;
        this.zObj = zObj;
    }

    public int allCalc(){
        return xObj.calc2() + yObj.calc2() + zObj.calc();
    }
}
