package by.it_academy.practice.homework8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework8 {
    public static void main(String[] args) {
        findSolutionTask1(getScanner());
        findSolutionTask2(getScanner());
        findSolutionTask3();
        findSolutionTask4();
        findSolutionTask5();
    }

    public static String getScanner() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }

    public static void findSolutionTask1(String txt) {
        char lastDigit = txt.charAt(txt.length() - 1);
        System.out.println("Last word is - " + lastDigit + "\n" + "Numbers of index:");
        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if (c == lastDigit) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean findSolutionTask2(String st) {
        int rightNumbers = st.length() - 1;
        int leftNumbers = 0;
        boolean flag = true;
        while (leftNumbers < rightNumbers) {
            if (st.charAt(leftNumbers) != st.charAt(rightNumbers))
                flag = false;
            leftNumbers++;
            rightNumbers--;
        }
        return flag;
    }

    public static void findSolutionTask3() {
        String txt = "Hello it's my first test and final second Test";
        int count = 0;
        String[] strings = txt.split(" ");
        for (String s : strings) {
            if (s.equalsIgnoreCase("test")) {
                count++;
            }
        }
        System.out.println("Количество вхождений слова \"test\" = " + count);
    }

    public static void findSolutionTask4() {
        String str = "1975 1976 1977 1978 1979 1980 1981 1982 1983 1984";
        String firstAge = "1977";
        String lastAge = "1982";
        Pattern pattern = Pattern.compile(firstAge);
        Pattern pattern2 = Pattern.compile(lastAge);
        Matcher matcher = pattern.matcher(str);
        Matcher matcher2 = pattern2.matcher(str);
        System.out.println("Years:");
        while (matcher.find() && matcher2.find()) {
            for (int i = Integer.parseInt(matcher.group()); i <= Integer.parseInt(matcher2.group()); i++) {
                System.out.println(i);

            }
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

