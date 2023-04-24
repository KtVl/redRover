package lesson13_2;
/*Задача №2
Необходимо создать класс Employee с полями:
имя, возраст, пол и ЗП в день. Все поля сделать приватными и
для каждого поля добавить методы set и get.
Класс должен иметь метод - getSalary(Month[] monthArray),
метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.*/
public final class Employee13_2 extends BaseEmployee13_2 {
    private int numberOfSubordinates;

    public Employee13_2(String name, int age, int salary, char sex, int numberOfSubordinates) {
        super(name, age, salary, sex);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary(MonthUtils.Month[] monthArray) {
        return super.getSalary(monthArray);
    }
}
