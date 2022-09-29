package HomeFive;

public class Boieng777 extends PassangerPlanes {

    @Override
    public String toString() {
        return "HomeFive.Boieng777= " + "capacity= " + capacity +
                "carrying= " + carrying +
                "flightRange= " + flightRange;
    }

    Boieng777(int capacity, int carrying, int flightRange) {
        super(capacity, carrying, flightRange);

    }
}

