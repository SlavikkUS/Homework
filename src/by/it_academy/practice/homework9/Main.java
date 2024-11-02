package by.it_academy.practice.homework9;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("Train");
        Order order1 = new Order("Slava", 1);

        order1.addItem(Item.BALL, Item.REFRIGERATOR);
        Order order2 = new Order("Vika", 2);
        order2.addItem(Item.BALL, Item.REFRIGERATOR);

        Order order3 = new Order("Pete", 3);
        order3.addItem(Item.PLAY_STATION, Item.TV, Item.BALL);

        shop.addOrders(order1, order2, order3);
        System.out.println(shop);
        shop.removeOrder("Pete");
        System.out.println(shop);
    }
}