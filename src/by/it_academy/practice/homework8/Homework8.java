package by.it_academy.practice.homework8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework8 {
    public static void main(String[] args) {
        findSolutionTask1();
        findSolutionTask2();
        findSolutionTask3();
        findSolutionTask4();
        findSolutionTask5();
    }

    public static String getScanner() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }

    public static void findSolutionTask1() {
        System.out.println("Введите строку (текст). Показать номера символов, совпадающих с последним символом строки.");
        String txt = getScanner();
        char lastDigit = txt.charAt(txt.length() - 1);
        System.out.println("Last word is - " + lastDigit + "\n" + "Numbers of index:");
        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if (c == lastDigit) {
                System.out.println(i + " ");
            }
        }
    }

    public static void findSolutionTask2() {
        System.out.println("Введите число (проверка на симметричность)");
        String number = getScanner();
        int rightNumbers = number.length() - 1;
        int leftNumbers = 0;
        boolean flag = true;
        while (leftNumbers < rightNumbers) {
            if (number.charAt(leftNumbers) != number.charAt(rightNumbers))
                flag = false;
            leftNumbers++;
            rightNumbers--;
        }
        if (flag == true) {
            System.out.println("Число является симметричным");
        } else {
            System.out.println("Число не является симметричным");
        }
    }

    public static void findSolutionTask3() {
        String text = "Hello it's my first test and i have second Test, for :test";
        Pattern pattern = Pattern.compile("[Tt]est");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            System.out.println(matcher.group());
            count++;
        }
        System.out.println(text + "\n" + "Количество вхождений слова \"test\" = " + count);
    }

    public static void findSolutionTask4() {
        String str = "1975 1976 1977 1978 1979 1980 1981 1982 1983 1984";
        Pattern pattern = Pattern.compile("19[78][^3-6]");
        Matcher matcher = pattern.matcher(str);
        System.out.println("Years:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void findSolutionTask5() {
        String txt2 = "11.233.111";
        Pattern pattern3 = Pattern.compile("(([1-9]\\d?|1[0-9]\\d?|2[0-4]\\d|250)?[.]){2}([1-9]\\d?|1[0-9]\\d?|2[0-4]\\d|250)");
        Matcher matcher = pattern3.matcher(txt2);
        if (matcher.matches()) {
            System.out.println("Is valid");
        } else {
            System.out.println("Not valid");
        }
    }
}

