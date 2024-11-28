package by.it_academy.practice.homework9;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("Train");
        Order order1 = new Order("Slava", 1);
        order1.addItem(new Item("REFRIGERATOR S-1", 22), new Item("TV SONY", 23));

        Order order2 = new Order("User-2", 2);
        order2.addItem(new Item("REFRIGERATOR SX-4", 33), new Item("Ball", 33));

        Order order3 = new Order("Pete", 3);
        order3.addItem(new Item("Ball", 11));

        shop.addOrders(order1, order2, order3);
        System.out.println(shop);
        shop.removeOrder("Pete");
        System.out.println(shop);
    }
}
