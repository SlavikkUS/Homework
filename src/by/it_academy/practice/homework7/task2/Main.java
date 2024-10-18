package by.it_academy.practice.homework7.task2;

public class Main {
    public static void main(String[] args) {
        Fly airBus = new Plane("AirBus", 310, 3, 600);
        Fly boeingR777 = new Plane("Boeing777", 300, 5, 500);
        Fly robbingR44 = new Helicopter("Robinson_R44", 5, 2, 79);
        Fly mi4 = new Helicopter("MI-4", 21, 2, 80);
        Fly kv = new Drone("KV-3", 1, 2, 10);
        System.out.println(airBus + "\n" + boeingR777 + "\n" + robbingR44 + "\n" + mi4 + "\n" + kv);

        Fly[] flies = {airBus, boeingR777, robbingR44, mi4, kv};

        AirCompany airCompany = new AirCompany(flies);
        System.out.println("Total capacity: " + airCompany.findGeneralCapacity());
        System.out.println("Total carrying: " + airCompany.findGeneralCarrying());
        System.out.println("Total flight range: " + airCompany.findGeneralFlightRange());

        System.out.println("Найти самолет в компании, соответствующий заданному диапазону параметров.");
        airCompany.findFinalAirShip();
    }
}
