package by.it_academy.practice.homework7.task2;


import java.util.Arrays;
import java.util.StringJoiner;

public class AirCompany {
    private Fly[] flies;
    private Planes[] planes;
    private Helicopters[] helicopters;
    private Kavdrobers[] kavdrobers;


    public AirCompany(Fly[] flies) {
        this.flies = flies;
        this.planes = planes;
        this.helicopters = helicopters;
        this.kavdrobers = kavdrobers;
    }

    public int findGeneralCapacity() {
        int fullCapacity = 0;
        for (Fly fly : flies) {
            fullCapacity += fly.getCapacity();
        }
        return fullCapacity;
    }

    public int findGeneralCarrying() {
        int fullCapacity = 0;
        for (Fly fly : flies) {
            fullCapacity += fly.getCarrying();
        }
        return fullCapacity;
    }

    public int findGeneralFlightRange() {
        int fullCapacity = 0;
        for (Fly fly : flies) {
            fullCapacity += fly.getFlightRange();
        }
        return fullCapacity;
    }

    public void findByCarrying(int max, int min) {
        for (Fly i : flies) {
            if (i.getCarrying() > max && i.getCarrying() < min) {
                System.out.println("Подходящий самолет: " + i.getName() +
                        " Грузоподъёмность борта составляет: " + i.getCarrying()
                );
            }
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", AirCompany.class.getSimpleName() + "[", "]")
                .add("planes=" + Arrays.toString(planes))
                .add("helicopters=" + Arrays.toString(helicopters))
                .add("kavdrobers=" + Arrays.toString(kavdrobers))
                .toString();
    }
}
