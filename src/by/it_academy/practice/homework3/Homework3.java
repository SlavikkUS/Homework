package by.it_academy.practice.homework3;

import java.time.Month;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое трехзначное число: ");
        int number = scanner.nextInt();
        System.out.println(findPrimeNumbers(number));
        getDegreeNumbers(number);
        getSymmetryFirstAndLastNumbers(number);
        System.out.println("Проверка на вероятность сущесствования треугольника");
        checkRealTriangle();
        System.out.print("В году 12 месяцев, введите число от 1 до 12 включая: ");
        int month = scanner.nextInt();
        findMonth(month);

    }

    public static String findPrimeNumbers(int number) {
        int number1 = (number / 100) * 100;
        int number2 = (number / 10 % 10) * 10;
        int number3 = (number % 10);
        return ("Result: " + number1 + " " + number2 + " " + number3);
    }

    public static void getDegreeNumbers(int number) {
        int number1 = number / 100;
        int number2 = number / 10 % 10;
        int number3 = number % 10;
        if ((number1 % 2 == 0) && (number2 % 2 == 0) && (number3 % 2 == 0)) {
            System.out.println("Степень четности числа " + number + " равно трем.");
        } else if ((number1 % 2 == 0) && (number2 % 2 == 0)
                || (number2 % 2 == 0) && (number3 % 2 == 0)
                || ((number1 % 2 == 0) && (number3 % 2 == 0))) {
            System.out.println("Степень четности числа " + number + " равна двум.");
        } else if ((number1 % 2 == 0) || (number2 % 2 == 0) || (number3 % 2 == 0)) {
            System.out.println("Степень четности числа " + number + " равно один.");
        } else System.out.println("Степень четности числа " + number + " равняется нулю.");

    }

    public static void getSymmetryFirstAndLastNumbers(int number) {
        int number1 = number / 100;
        int number3 = number % 10;
        if (number > 0) {
            if (number1 == number3) {
                System.out.println("Число " + number + " является симметричным");
            } else System.out.println("Число " + number + " несимметричное");
        } else System.out.println("Число отрицательное");
    }

    public static void checkRealTriangle() {
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

    public static void findMonth(int month) {
        switch (month) {
            case 1:
                System.out.println(Month.DECEMBER + " - is a winter season");
                break;
            case 2:
                System.out.println(Month.JANUARY + " - is a winter season");
                break;
            case 3:
                System.out.println(Month.FEBRUARY + " - is a winter season");
                break;
            case 4:
                System.out.println(Month.MARCH + " - is a spring season");
                break;
            case 5:
                System.out.println(Month.APRIL + " - is a spring season");
                break;
            case 6:
                System.out.println(Month.MAY + " - is a spring season");
                break;
            case 7:
                System.out.println(Month.JUNE + " - is a summer season");
                break;

            case 8:
                System.out.println(Month.JULY + " - is a summer season");
                break;
            case 9:
                System.out.println(Month.AUGUST + " - is a summer season");
                break;
            case 10:
                System.out.println(Month.SEPTEMBER + " - is a autumn season");
                break;
            case 11:
                System.out.println(Month.OCTOBER + " - is a autumn season");
                break;
            case 12:
                System.out.println(Month.NOVEMBER + " - is a autumn season");
                break;
            default:
                System.out.println("Year has only 12 month ,please, try again.");
        }
    }


}



