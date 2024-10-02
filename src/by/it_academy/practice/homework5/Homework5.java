package by.it_academy.practice.homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    private static void task1() {
        int length = 7;
        int count = 1;
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = count;
                count += 1;
            }
        }
        System.out.println("For Array:  1, 0, 2, 0, 3, 0, 4");
        System.out.println(Arrays.toString(array));
        int countArrayTwo = 1;
        int countArrayThird = -2;
        int[] array2 = new int[length];
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0) {
                array2[i] = countArrayTwo;
                countArrayTwo = countArrayTwo + 2;
            }
            if (i % 2 != 0) {
                array2[i] = countArrayThird;
                countArrayThird = countArrayThird - 2;
            }

        }
        System.out.println("For Array:  1, -2, 3, -4, 5, -6");
        System.out.println(Arrays.toString(array2));
    }

    private static void task2() {
        System.out.println("Заменить каждый элемент массива с нечетным индексом на ноль");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void task3() {
        System.out.println("Является ли массив возрастающей последовательностью: ");
        boolean isExit = true;
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (10 + Math.random() * 90);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isExit = false;
                break;
            }
        }
        if (isExit) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающей последовательностью");
        }
    }

    private static void task4() {
        System.out.print("Введите длину массива - ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String arrayEven = "";
        String arrayOdd = "";
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            int numbers = (int) (10 + Math.random() * 90);
            array[i] = numbers;
            if (i % 2 == 0) {
                arrayEven += array[i] + " ";
            } else {
                arrayOdd += array[i] + " ";
            }
        }
        System.out.println("Данные всего массива:");
        System.out.println(Arrays.toString(array));
        System.out.println("Значения из четных ячеек массива:");
        System.out.println(arrayEven);
        System.out.println("Значения из нечетных ячеек массива:");
        System.out.println(arrayOdd);
    }

    private static void task5() {
        System.out.print("Метод проверяет, находится ли число Х в массиве, введите число Х = ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isExit = false;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            if (array[i] == number) {
                isExit = true;
            }
        }
        System.out.println(isExit);
        System.out.println("Данные всего массива:");
        System.out.println(Arrays.toString(array));
    }
}

