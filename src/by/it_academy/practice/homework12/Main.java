package by.it_academy.practice.homework12;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static final List<String> valueList = Arrays.asList("a1", "a2", "a3", "b1", "b2", "b3", "c2", "c1", "c5");

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        sortByParameter(Comparator.comparing(Book::getAuthor), "-Sort by Authors:");
        sortByParameter(Comparator.comparing(Book::getTittle), "-Sort by Tittle:");
        sortByParameter(Comparator.comparing(Book::getPages), "-Sort by Pages:");
        sortBySublistAuthor();
        sortByStream();
    }

    private static List<Book> create() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Оурел", "1984", 2021, 221));
        books.add(new Book("Короткевич", "Дзiкае паляванне караля Стаха", 2020, 200));
        books.add(new Book("Толкиен", "Хоббит", 2024, 233));
        books.add(new Book("Толкиен", "Братство кольца", 1954, 300));
        return books;
    }

    private static void sortByParameter(Comparator<Book> comparator, String text) {
        System.out.println(text);
        List<Book> sortList = create().stream().sorted(comparator.thenComparing(Book::toString)).toList();
        System.out.println(sortList);
    }

    private static void sortBySublistAuthor() {
        Map<String, List<Book>> sortedByAuthor = create().stream()
                .collect(Collectors.groupingBy(Book::getAuthor));
        for (Map.Entry<String, List<Book>> item : sortedByAuthor.entrySet()) {
            System.out.println(item.getKey());
            for (Book book : item.getValue()) {
                System.out.println("- " + book.getTittle());
            }
        }
    }

    private static void sortByStream() {
        long number = valueList.stream().filter(word -> !word.matches("\\w3"))
                .sorted((o1, o2) -> Integer.compare(o1.charAt(1), (o2.charAt(1))))
                .sorted((o1, o2) -> o2.compareTo(o1))
                .skip(1)
                .sorted((o1, o2) -> Collections.reverseOrder().compare(o2, o1))
                .skip(1)
                .sorted((o1, o2) -> Collections.reverseOrder().compare(o1, o2))
                .map(String::toUpperCase)
                .peek(System.out::println)
                .count();
        System.out.printf("Amount of elements: %d ", number);
    }

    private static List<Book> readBooksFromFile(String filePath) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Book> readBook = (List<Book>) objectInputStream.readObject();
        return readBook;
    }

    private static void writeBooksToFile(List<Book> books) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("resources/books.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(books);
        objectOutputStream.close();
    }
}
