package by.it_academy.practice.homework6;

public class Student extends Human {
    private final int ageStudy;

    public Student(String name, String gender, int age, int weight, int ageStudy) {
        super(name, gender, age, weight);
        this.ageStudy = ageStudy;
    }

    public int task3() {
        int count = 0;
        for (int i = 2014; i <= 2019; i++) {
            if (getAgeStudy() > i) {
                count++;
            }
        }
        return count;
    }

    public int getAgeStudy() {
        return ageStudy;
    }
}
