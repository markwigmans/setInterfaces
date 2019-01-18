package com.capgemini.setrack.interfaces.model;

/**
 *
 */
public class Rectangle implements Printable {

    private final int x;
    private final int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
