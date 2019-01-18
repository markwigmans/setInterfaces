package com.capgemini.setrack.interfaces.model;

/**
 *
 */
public class Manager extends IdObject implements Printable {

    public Manager(String name, int id) {
        super(name, id);
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() + "}";
    }
}
