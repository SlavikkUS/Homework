package HomeFive;

public class PlainMain implements Comparable<Flyeble> {
    int capacity;
    int carrying;
    int flightRange;

    public int getCapacity() {
        return capacity;
    }

    public int getCarrying() {
        return carrying;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public PlainMain(int capacity, int carrying, int flightRange) {
        this.capacity = capacity;
        this.carrying = carrying;
        this.flightRange = flightRange;
    }

    @Override
    public int compareTo(Flyeble o) {
        if (flightRange == o.getFlightRange())
            return 0;
        else if (flightRange < o.flightRange)
            return 1;
        else
            return -1;
    }
}
