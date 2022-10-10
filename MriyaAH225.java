package HomeFive;

public class MriyaAH225 extends PassangerPlanes {
    @Override
    public String toString() {
        return "HomeFive.MriyaAH225= " +
                "carrying=" + carrying +
                "capacity= " + capacity + "flightRange" + flightRange;
    }


    public MriyaAH225(int capacity, int carrying, int flightRange) {
        super(capacity, carrying, flightRange);
    }


}

