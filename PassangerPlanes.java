package HomeFive;

public class PassangerPlanes extends Flyeble {


    PassangerPlanes(int capacity, int carrying, int flightRange) {
        super(capacity, carrying, flightRange);
    }

    @Override
    public int hashCode() {
        return flightRange;
    }
}
