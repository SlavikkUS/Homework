package HomeworkNine;

import java.io.*;


public class MainNine {
    public static void main(String[] args) {
        findCountWords(createFile("text."));
    }

    public static String createFile(String line) {
        BufferedReader bufferedReader = null;
        try {
            File file = new File("Hello planet Mars");
            file.createNewFile();
            if (!file.exists())
                file.createNewFile();
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("Mars is the fourth planet from the Sun and the second-smallest planet in the Solar System, being larger than only Mercury." +
                    " In the English language, Mars is named for the Roman god of war.");
            printWriter.close();
            bufferedReader = new BufferedReader(new FileReader("Hello planet Mars"));

            while ((line = bufferedReader.readLine()) != null) {
                return String.valueOf(("Number words in text: " + findCountWords(line))) + " Number punctuation marks int text: " + String.valueOf(findCountPunctuationMarks(line));
            }
        } catch (IOException e) {
            System.out.println("Error" + e);
        } finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println("Error" + e);
            }
        }
        return String.valueOf(findCountWords(line));
    }

    public static int findCountWords(String text) {
        System.out.println(text);
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static int findCountPunctuationMarks(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.' ||
                    text.charAt(i) == ',' || text.charAt(i) == '!' || text.charAt(i) == '?' ||
                    text.charAt(i) == ':' || text.charAt(i) == ';' || text.charAt(i) == '-') {
                count++;
            }
        }
        return count;
    }
}

