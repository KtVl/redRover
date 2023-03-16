package lesson7;

public class Employee {
    private String name;
    private int age;
    private int gender;
    private int salary;

    public Employee(String name, int gender, int age, int salary) { // конструктор для ссылки на текущий объект
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public boolean isSameName(Employee worker1) {
        if (this.name.equals(worker1.name)) {
            return true;
        }
        return false;
    }
}
