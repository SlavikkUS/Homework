package by.it_academy.practice.homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shop {
    private List<Order> List;
    private String nameOfShop;

    public Shop(String nameOfShop) {
        this.List = new ArrayList<>();
        this.nameOfShop = nameOfShop;
    }

    public List<Order> getList() {
        return List;
    }

    public String getNameOfShop() {
        return nameOfShop;
    }

    public void addOrders(Order... order) {
        this.List.addAll(Arrays.asList(order));
    }

    public void removeOrder(String name) {
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i).getNameBuyer().equals(name)) {
                List.remove(List.get(i));
            }
        }
    }

    public void findSum() {
        int sum = 0;
        for (int i = 0; i < List.size(); i++) {
            sum = sum + List.get(i).getSum();
        }
        System.out.format("Overall sum on this moment is: %s", sum);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Shop{");
        sb.append("List=").append(List);
        sb.append(", nameOfShop='").append(nameOfShop).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
