package by.it_academy.practice.homework6;

public class Human {
    private final String name;
    private final String gender;
    private final int age;
    private final int weight;

    public Human(String name, String gender, int age, int weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human[" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ']';
    }
}
