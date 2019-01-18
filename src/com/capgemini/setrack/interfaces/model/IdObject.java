package com.capgemini.setrack.interfaces.model;

import java.util.Objects;

/**
 * Abstract class to model name/OD combination
 */
public abstract class IdObject {
    private String name;
    private final int id;

    protected IdObject(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "IdObject{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdObject idObject = (IdObject) o;
        return id == idObject.id &&
                Objects.equals(name, idObject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
