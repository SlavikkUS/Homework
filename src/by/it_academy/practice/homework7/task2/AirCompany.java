package by.it_academy.practice.homework7.task2;

public class AirCompany {
    private Fly[] flies;

    public AirCompany(Fly[] flies) {
        this.flies = flies;
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
}
