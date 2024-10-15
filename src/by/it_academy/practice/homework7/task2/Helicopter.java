package by.it_academy.practice.homework7.task2;

public class Helicopter extends Fly {

    public Helicopter(String name, int capacity, int carrying, int flightRange) {
        super(name, capacity, carrying, flightRange);
    }
    public int getCapacity() {
        return capacity;
    }
    public int getCarrying(){
        return carrying;
    }
}
