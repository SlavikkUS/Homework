package by.it_academy.practice.homework12;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        sorttt(Comparator.comparing(Book::getAuthor), "-Sort by Authors:");
        sorttt(Comparator.comparing(Book::getTittle), "-Sort by Tittle:");
        sorttt(Comparator.comparing(Book::getPages), "-Sort by Pages:");
        sortByAuthorTask3();
    }

    private static List<Book> create() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Оурел", "1984", 2021, 221));
        books.add(new Book("Короткевич", "Дзiкае паляванне караля Стаха", 2020, 200));
        books.add(new Book("Толкиен", "Хоббит", 2024, 233));
        books.add(new Book("Толкиен", "Братство кольца", 1954, 300));
        return books;
    }

    private static void sorttt(Comparator<Book> comparator, String txt) {
        System.out.println(txt);
        List<Book> sortList = create().stream().sorted(comparator.thenComparing(Book::toString)).toList();
        System.out.println(sortList);
    }

    private static void sortByAuthorTask3() {
        Map<String, List<Book>> sortedByAuthor = create().stream()
                .collect(Collectors.groupingBy(Book::getAuthor));
        for (Map.Entry<String, List<Book>> item : sortedByAuthor.entrySet()) {
            System.out.println(item.getKey());
            for (Book book : item.getValue()) {
                System.out.println("- " + book.getTittle());
            }
        }
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
