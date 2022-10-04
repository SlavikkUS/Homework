package HomeFive;

public class AirBus321 extends PassangerPlanes {
    @Override
    public String toString() {
        return "HomeFive.AirBus321= " + "carrying=" + carrying + "capacity= " + capacity + "flightRange= " + flightRange;
    }


    public AirBus321(int capacity, int carrying, int flightRange) {
        super(capacity, carrying, flightRange);

    }

    @Override
    public int hashCode() {
        return flightRange;
    }

}
