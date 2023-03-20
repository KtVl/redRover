package lesson8;

public class Employee {
    private String name;
    private int age;
    private int gender;
    private int salaryDays;

    public Employee(String name, int gender, int age, int salaryDays) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salaryDays = salaryDays;
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
        salaryDays *=  days;
        return salaryDays;
    }

    public void setSalaryDays(int salaryDays) {
        this.salaryDays = salaryDays;
    }


}
