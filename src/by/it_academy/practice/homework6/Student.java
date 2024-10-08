package by.it_academy.practice.homework6;

public class Student extends Human {

    private int ageStudy;

    public Student(String name, String gender, int age, int weight, int ageStudy) {
        super(name, gender, age, weight);
        this.ageStudy = ageStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", age=" + super.getAge() +
                ", weight=" + super.getWeight() +
                ", ageStudy=" + getAgeStudy() +
                '}';
    }

    public void increaseAgeStudy() {
        this.ageStudy = ageStudy + 1;
        System.out.println("Увеличение года обучения" + ageStudy);
    }

    public int getAgeStudy() {
        return ageStudy;
    }
}




