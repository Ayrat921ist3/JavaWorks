package ru.itis;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Transport transport = new Transport(10) {
            @Override
            public void go() {
                System.out.print("Hello!");
            }
        };

        Auto auto = new Auto(4, 95);
        SportAuto sportAuto = new SportAuto(4, 98);
        Bike bike = new Bike(2);

        List<Transport> transports = new ArrayList<>();
        transports.add(auto);
        transports.add(sportAuto);
        transports.add(bike);
        transports.add(new Auto(8, 95));

        find(transports).go();
    }

    private static Transport find(List<Transport> transports){
        Transport found = null;
        int minimum = transports.get(0).getWheelsCount();
        for (Transport currentTransport : transports){
            if(currentTransport.getWheelsCount() <= minimum){
                found = currentTransport;
                minimum = currentTransport.getWheelsCount();
            }
        }
        return found;
    }
}
