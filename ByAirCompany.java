package HomeFive;

import java.util.Arrays;

public class ByAirCompany {

    int flightRange;
    private Object[] arrayPlanesAndHalicopters;
    private Boieng777 boieng = new Boieng777(550, 66, 11_000);
    private MriyaAH225 mriyaAH225 = new MriyaAH225(10, 300, 15_400);
    private AirBus321 airBus321 = new AirBus321(220, 21, 6_000);
    private Robbinson_R44 robbinson_r44 = new Robbinson_R44(4, 1, 665);


    void getGeneralInformationAndSortFlightRange() {
        arrayPlanesAndHalicopters = new Flyeble[4];
        arrayPlanesAndHalicopters[0] = new Boieng777(550, 66, 11_000);
        arrayPlanesAndHalicopters[1] = new MriyaAH225(10, 300, 15_400);
        arrayPlanesAndHalicopters[2] = new AirBus321(220, 21, 6_000);
        arrayPlanesAndHalicopters[3] = new Robbinson_R44(4, 1, 665);
        Arrays.sort(arrayPlanesAndHalicopters);
        System.out.println(Arrays.toString(arrayPlanesAndHalicopters));
    }

    void getCapacityAndCarrying() {
        System.out.println("General capacity (places):");
        System.out.println(mriyaAH225.getCapacity() + boieng.getCapacity() + airBus321.getCapacity() + robbinson_r44.getCapacity());
        System.out.println("General carrying (tones):");
        System.out.println(mriyaAH225.getCarrying() + boieng.getCarrying() + airBus321.getCarrying() + robbinson_r44.getCarrying());
    }
}
