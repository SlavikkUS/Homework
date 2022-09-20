package HomerworkFour;
/*
 *
 *
 * author Usenkov Slava;
 */

import java.util.Scanner;

public class HomeworkFour {
    public static void main(String[] args) {
        System.out.print("Enter your text:");
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        System.out.print("Uniques words in text: ");
        findUniquesWords(words);
        scanner.close();
    }

    private static void findUniquesWords(String words) {
        String[] arrayWords = words.split(" ");
        for (int i = 0; i < arrayWords.length; i++) {
            int numbers = 1;
            for (int j = i + 1; j < arrayWords.length; j++) {
                if (arrayWords[i].equalsIgnoreCase(arrayWords[j])) {
                    numbers++;
                    arrayWords[j] = "";
                }
            }
            if (numbers == 1) {
                System.out.print(arrayWords[i] + " ");
            }
        }
    }
}