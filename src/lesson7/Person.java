package lesson7;

public class Person {
    private String name;
    private int age;
    private int gender;


    public Person(String name, int gender, int age) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public int getName() {
        return gender;
    }

    @Override
    public String toString() {
        return name + ". " + age + "лет." + gender;
    }
}


