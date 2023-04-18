package com.solvd.ta.lab2;

/*
 * This class is used to represent a Stadium. It contains fields of the Stadium's name and capacity. It has getters and
 * setters for each field. It also has proper implementation of the toString(), equals(), and hashCode() methods.
 */

import java.util.Objects;

class Stadium {
    private String name;
    private int capacity;

    Stadium(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Stadium{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stadium stadium = (Stadium) o;
        return capacity == stadium.capacity &&
                Objects.equals(name, stadium.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity);
    }
}


