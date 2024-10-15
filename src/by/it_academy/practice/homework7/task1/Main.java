package by.it_academy.practice.homework7.task1;

public class Main {
    public static void main(String[] args) {
        Money money = new Money(3, 2);
        money.addSum(money);
        Money money1 = new Money(3, 0);
        System.out.println(money);
        System.out.println(money1);
        money.checkBiggerObject(money1);
    }
}