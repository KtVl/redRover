package lesson8;

public class Manager {
    private String name;
    private int age;
    private int gender;
    private int salaryDays;
    private int numberOfSubordinates;

    public Manager(String name, int gender, int age, int salaryDays, int numberOfSubordinates) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salaryDays = salaryDays;
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getSalary(int days) {
        salaryDays *= days;
        return salaryDays;
    }

    public void setSalaryDays(int salaryDays) {
        this.salaryDays = salaryDays;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public double persent(int getSalary) {
        double persent = getSalary;
        persent= persent + (persent*0.01) * getNumberOfSubordinates();
        return persent;
    }
}