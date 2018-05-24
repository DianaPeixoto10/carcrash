package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Direction;
import org.academiadecodigo.carcrash.field.Position;

public class CarFactory {

    public static Car getNewCar() {

        Position pos;
        CarType[] carray = CarType.values();
        CarType car = carray[(int) (Math.random())];

        switch (car) {
            case SAXO:
                return new Saxo();
            case IBIXA:
                return new Ibiza();
        }
    }
}
