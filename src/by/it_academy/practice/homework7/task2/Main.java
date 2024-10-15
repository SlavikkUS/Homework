package by.it_academy.practice.homework7.task2;

public class Main {
    public static void main(String[] args) {
        Plane airBus = new Plane("AirBus", 310, 3, 600);
        System.out.println(airBus);
        Plane boeing_777 = new Plane("Boeing777", 300, 5, 500);
        System.out.println(boeing_777);
        Helicopter robbinsonR44 = new Helicopter("Robbinson_R44", 5, 2, 79);
        System.out.println(robbinsonR44);
        Helicopter mi_4 = new Helicopter("MI-4", 21, 2, 80);
        System.out.println(mi_4);
        Drone kv = new Drone("KV-3", 1, 2, 10);
        System.out.println(kv);

        Fly[] flies = {airBus, boeing_777, robbinsonR44, mi_4, kv};

        AirCompany airCompany = new AirCompany(flies);
        System.out.print("Total capacity: ");
        System.out.println(airCompany.findGeneralCapacity());
        System.out.print("Total carrying: ");
        System.out.println(airCompany.findGeneralCarrying());
        System.out.print("Total flightRange: ");
        System.out.println(airCompany.findGeneralFlightRange());
        System.out.println("Найти самолет в компании, соответствующий заданному диапазону параметров.");
        airCompany.findByCarrying(4, 6);
    }
}
