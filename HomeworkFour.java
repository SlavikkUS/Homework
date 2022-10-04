package HomerworkFour;
/*
 *
 *
 * author Usenkov Slava;
 */


import java.util.*;

public class Unique {

    public static void main(String[] args) {
        String str = "Listen to the news from today and read the text at the same time. Listen to the news from today without reading the text";
        findUniqueWords(str);

    }

    public static void findUniqueWords(String str) {
        HashSet<String> output = new HashSet<>();
        String[] array = str.split("\\s+");
        for (int i = 0; i < array.length; i++) {
            if (!output.contains(array[i])) {
                output.add(array[i]);
            }
        }

        System.out.print("Number unique words is: " + output.size());
    }
}
