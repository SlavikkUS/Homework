package by.it_academy.practice.homework6;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human human = new Human("Leo", "Man", 27, 100);
        System.out.println(human);
        Student student = new Student("Margo", "Female", 23, 56, 2018);
        System.out.println(student);
        getText();
        System.out.println(student.task3());
    }

    private static void getText() {
        System.out.print("Количество лет в университете: ");
    }
}
