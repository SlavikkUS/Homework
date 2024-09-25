package by.it_academy.practice.homework4;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        writeMultiplicationTable();
        findMultiplyTwoNumbers();
        findNumberFabonacchi(findNumber());
        findSummaryNumbers();
    }

    public static void writeMultiplicationTable() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int number = i * j;
                System.out.print(number + "\t");
            }
            System.out.println("\n");
        }
    }

    public static void findMultiplyTwoNumbers() {
        System.out.println("Find multiply two numbers:");
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter findNumber a = ");
            int number1 = scanner.nextInt();
            System.out.print("Enter findNumber b = ");
            int number2 = scanner.nextInt();
            int result = number1 * number2;
            System.out.println("Result " + result);
            System.out.println("Do you want stop, press findNumber \"1\"?");
            number = scanner.nextInt();

        } while (number != 1);
    }

    public static int findNumber() {
        System.out.print("Введите размерность: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static void findNumberFabonacchi(int number) {
        int number1 = 0;
        int number2 = 1;
        int result;
        System.out.print(number2 + " ");
        for (int i = 1; i < number; i++) {
            result = number1 + number2;
            number1 = number2;
            number2 = result;
            System.out.print(result + " ");
        }
        System.out.println(" ");
    }

    public static void findSummaryNumbers() {
        System.out.println("Enter numbers, find summary:");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum = sum + number;
                if (number == 0) {
                    break;
                }
                if (number > 0) {
                    System.out.println("Плюс");
                } else {
                    System.out.println("Минус");
                }
            }
            System.out.println(sum);
        }
    }
}