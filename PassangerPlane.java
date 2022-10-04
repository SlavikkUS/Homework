package HomeFive;

public class PassangerPlane extends Flyeble {


    PassangerPlane(int capacity, int carrying, int flightRange) {
        super(capacity, carrying, flightRange);
    }

    @Override
    public int hashCode() {
        return flightRange;
    }
}
