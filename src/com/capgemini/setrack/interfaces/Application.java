package com.capgemini.setrack.interfaces;

import com.capgemini.setrack.interfaces.model.Manager;
import com.capgemini.setrack.interfaces.model.Printable;
import com.capgemini.setrack.interfaces.model.Rectangle;
import com.capgemini.setrack.interfaces.model.SportCar;

public class Application {

    public static void main(String[] args) {
        final Printable vec[] = {
                new Rectangle(200, 100),
                new SportCar("Fiat", 7892321),
                new Rectangle(34, 32),
                new Manager("Gidi", 32),
                new Rectangle(54, 10),
                new SportCar("Audi", 4322344),
                new SportCar("Mazda", 4322343),
                new Manager("Moshe", 2344322)};

        // print all objects in vex[]
        for (Printable p : vec) {
            p.print();
        }
    }
}
