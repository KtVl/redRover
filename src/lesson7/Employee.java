package lesson7;

public class Employee {
    private String name;
    private int age;
    private int gender;
    private double salary;

    public Employee(String name, int gender, int age, int salary) { // конструктор для ссылки на текущий объект
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isSameName(Employee employee1) {
        if (this.name.equals(employee1.name)) {
            return true;
        }
        return false;
    }
}
