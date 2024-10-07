package by.it_academy.practice.homework6;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Leo", "Man", 27, 100);
        printObject(human);
        Student student = new Student("Margo", "Female", 23, 56, 1);
        printObject(student);
        student.setAgeStudy(2);
        printObject(student);
    }

    private static void printObject(Object o) {
        System.out.println(o);
    }

}
