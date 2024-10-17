package by.it_academy.practice.homework7.task2;

import java.util.Scanner;

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

    public Object findShipForCapacity(int min, int max) {
        for (Fly fly : flies) {
            if (fly.getCapacity() > min && fly.getCapacity() < max) {
                return "Подходящее воздушное судно " + fly;
            }
        }
        return "Нет подходящего воздушного транспорта";
    }


    public Object findShipForCarrying(int min, int max) {
        for (Fly fly : flies) {
            if (fly.getCarrying() > min && fly.getCarrying() < max) {
                return "Подходящее воздушное судно " + fly;
            }
        }
        return "Нет подходящего воздушного транспорта";
    }

    public Object findShipForFlightRange(int min, int max) {
        for (Fly fly : flies) {
            if (fly.getCarrying() > min && fly.getCarrying() < max) {
                return "Подходящее воздушное судно " + fly;
            }
        }
        return "Нет подходящего воздушного транспорта";
    }

    public void findFinalAirShip() {
        System.out.println("Выберете вид авиаперевозок: 1 - пассажирский 2 - грузовой 3 - автономность в пути (max расстояние)");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Введите минимальные требования к борту");
        int min = scanner.nextInt();
        System.out.println("Введите максимальные требования к борту");
        int max = scanner.nextInt();
        switch (num) {
            case 1 -> System.out.println(findShipForCapacity(min, max));
            case 2 -> System.out.println(findShipForCarrying(min, max));
            case 3 -> System.out.println(findShipForFlightRange(min, max));
            default -> System.out.println("Извините, выберете правильный вид перевозок!");
        }
    }
}
