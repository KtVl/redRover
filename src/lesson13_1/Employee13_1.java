package lesson13_1;

public abstract class Employee13_1 {
    //  Необходимо создать класс Employee со следующими методами:
    //getBaseSalary - получить базовую ставку
    //setBaseSalary
    //getName - получить имя
    //setName
    //getSalary - получить зарплату (должен быть абстрактный)

    private String name;
    private int BaseSalary;

    public Employee13_1(String name, int baseSalary) {
        this.name = name;
        BaseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        BaseSalary = baseSalary;
    }

    public abstract int getSalary();
}
