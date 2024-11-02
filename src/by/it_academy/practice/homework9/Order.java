package by.it_academy.practice.homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    String nameBuyer;
    int numberInLine;
    List<Item> arrayList;

    public Order(String nameBuyer, int numberInLine) {
        this.arrayList = new ArrayList<>();
        this.nameBuyer = nameBuyer;
        this.numberInLine = numberInLine;
    }

    public String getNameBuyer() {
        return nameBuyer;
    }

    public void addItem(Item... item) {
        arrayList.addAll(Arrays.asList(item));
    }

    public void removeItem(Item item) {
        arrayList.remove(item);
    }

    public int getSum() {
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum = sum + arrayList.get(i).getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order{");
        sb.append("arrayList=").append(arrayList);
        sb.append(", nameBuyer='").append(nameBuyer).append('\'');
        sb.append(", numberInLine=").append(numberInLine);
        sb.append('}');
        return sb.toString();
    }
}
