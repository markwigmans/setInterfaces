package com.capgemini.setrack.interfaces.model;

/**
 *
 */
public class SportCar extends IdObject implements Printable {

    public SportCar(String name, int id) {
        super(name, id);
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + super.toString() + "}";
    }
}
