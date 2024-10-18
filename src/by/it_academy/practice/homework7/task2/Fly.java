package by.it_academy.practice.homework7.task2;

import java.util.StringJoiner;

public abstract class Fly {
    String name;
    int capacity;
    int carrying;
    int flightRange;

    protected Fly(String name, int capacity, int carrying, int flightRange) {
        this.name = name;
        this.capacity = capacity;
        this.carrying = carrying;
        this.flightRange = flightRange;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCarrying() {
        return carrying;
    }

    public int getFlightRange() {
        return flightRange;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "[", "]")
                .add("name='" + name + "'")
                .add("capacity=" + capacity)
                .add("carrying=" + carrying)
                .add("flightRange=" + flightRange)
                .toString();
    }
}