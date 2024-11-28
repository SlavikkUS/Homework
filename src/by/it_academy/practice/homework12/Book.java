package by.it_academy.practice.homework12;

import java.io.Serializable;

public class Book implements Serializable {
    private String author;
    private String tittle;
    private int year;
    private int pages;

    public Book(String author, String tittle, int year, int pages) {
        this.author = author;
        this.tittle = tittle;
        this.year = year;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTittle() {
        return tittle;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("author='").append(author).append('\'');
        sb.append(", tittle='").append(tittle).append('\'');
        sb.append(", year=").append(year);
        sb.append(", pages=").append(pages);
        sb.append('}');
        return sb.toString();
    }
}
