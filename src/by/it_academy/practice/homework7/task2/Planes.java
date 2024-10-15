package by.it_academy.practice.homework7.task2;


public class Planes extends Fly {
    public Planes(String name, int capacity, int carrying, int flightRange) {
        super(name, capacity, carrying, flightRange);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Planes{");
        sb.append("name='").append(name).append('\'');
        sb.append(", capacity=").append(capacity);
        sb.append(", carrying=").append(carrying);
        sb.append(", flightRange=").append(flightRange);
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
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
}
