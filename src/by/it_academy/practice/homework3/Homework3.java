package by.it_academy.practice.homework3;

import java.time.Month;
import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {
        System.out.print("Введите целое трехзначное число: ");
        findPrimeNumbers(findNumbers());
        System.out.print("Введите число, а мы проверил четность введённых цифр:");
        findDegreeNumbers(findNumbers());
        findSymmetryFirstAndLastNumbers();
        findRealTriangle();
        findMonth();
    }

    public static void findPrimeNumbers(int number) {
        int number1 = (number / 100) * 100;
        int number2 = (number / 10 % 10) * 10;
        int number3 = (number % 10);
        System.out.println("Result: " + number1 + " " + number2 + " " + number3);
    }

    public static int findNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static void findDegreeNumbers(int number) {
        if (number > 99 && number < 1000) {
            int number1 = number / 100;
            int number2 = number / 10 % 10;
            int number3 = number % 10;
            int sum = 0;
            if (number1 % 2 == 0) {
                sum++;
            }
            if (number2 % 2 == 0) {
                sum++;
            }
            if (number3 % 2 == 0) {
                sum++;
                System.out.println("Степень четности числа " + number + " равняется: " + sum);

            } else
                System.out.println("Степень четности числа " + number + " равняется: " + sum);

        } else
            System.out.println("error");
    }

    public static void findSymmetryFirstAndLastNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Проверка числа на симметричность,введите число: ");
        int number = scanner.nextInt();
        int number1 = number / 100;
        int number3 = number % 10;
        if (number > 0) {
            if (number1 == number3) {
                System.out.println("Число " + number + " является симметричным");
            } else
                System.out.println("Число " + number + " несимметричное");
        } else
            System.out.println("Число отрицательное");
    }

    public static void findRealTriangle() {
        System.out.println("Проверка на вероятность сущесствования треугольника");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Длина стороны один: ");
        int number1 = scanner.nextInt();
        System.out.print("Длина стороны два: ");
        int number2 = scanner.nextInt();
        System.out.print("Длина стороны три:  ");
        int number3 = scanner.nextInt();
        if ((number1 + number2 > number3) && (number2 + number3 > number1) && (number1 + number3 > number2)) {
            System.out.println("Треугольник существует");
        } else System.out.println("Тругольник не существует");
    }

    public static void findMonth() {
        System.out.print("Enter number month of year:");
        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt();
        String yearMonth = switch (monthNumber) {
            case 1 -> "Winter month is: " + Month.DECEMBER;
            case 2 -> "Winter month is: " + Month.JANUARY;
            case 3 -> "Winter month is: " + Month.FEBRUARY;
            case 4 -> "Spring season is: " + Month.MARCH;
            case 5 -> "Spring season is: " + Month.APRIL;
            case 6 -> "Spring season is: " + Month.MAY;
            case 7 -> "Summer season is: " + Month.JUNE;
            case 8 -> "Summer season is: " + Month.JULY;
            case 9 -> "Summer season is: " + Month.AUGUST;
            case 10 -> "Autumn season is: " + Month.SEPTEMBER;
            case 11 -> "Autumn season is: " + Month.OCTOBER;
            case 12 -> "Autumn season is: " + Month.NOVEMBER;
            default -> "Season has only 12 month! Please enter index from 1 to 12.";
        };
        System.out.println(yearMonth);
    }
}




