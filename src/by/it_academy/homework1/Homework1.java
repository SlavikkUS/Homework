package by.it_academy.homework1;

import java.util.Scanner;

public class Homework1 {
    public static final int number1 = 10;
    public static final int number2 = 20;
    public static int result = 0;

    public static void main(String[] args) {
        findSumAndMultiplyNumbers();
        resultNumbers();
        findLastNumber();
        getSumNumbers();
        findPerimeterAndSquare();
        findAverageSum();
    }

    public static void findSumAndMultiplyNumbers() {

        int result = number1 + number2;
        System.out.println("Найти сумму чисел: " + result);
        result = number1 * number2;
        System.out.println("Найти произведение двух чисел " + result);
    }

    public static void resultNumbers() {
        result = 20 + (3 * 8) / 8;
        System.out.println("Результат вычисления " + result);
    }

    public static void findLastNumber() {
        result = number1 % 10;
        System.out.println("Последняя цифра числа 10 - " + result);
    }

    public static void getSumNumbers() {
        int number = 1234;
        System.out.println("Найти сумму цифр ab + cd числа abcd = " +
                ((number % 10 + number / 10 % 10) + (number / 100 % 10 + number / 1000 % 10)));
    }

    public static void findPerimeterAndSquare() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите радиус:");
        double resilt;
        int radius = scanner.nextInt();
        resilt = Math.PI * (radius * radius);
        System.out.println("Результат площади круга: " + resilt);
        resilt = 2 * Math.PI * radius;
        System.out.println("Результат периметра круга " + resilt);
    }

    public static void findAverageSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double number1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        double number2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        double number3 = scanner.nextInt();
        System.out.print("Enter fourth number: ");
        double number4 = scanner.nextInt();
        System.out.print("Enter fifth number: ");
        double number5 = scanner.nextInt();
        result =(int) (number1 + number2 + number3) / 3;
        System.out.print("Среднее арифметическое пяти чисел равно: "+ result);
    }

}