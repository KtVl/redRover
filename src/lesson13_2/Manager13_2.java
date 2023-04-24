package lesson13_2;
/*Задача №3
Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
 Все поля сделать приватными и для каждого поля добавить методы set и get.
 Класс должен иметь метод - getSalary(Month[] monthArray),
 метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.*/
public final class Manager13_2 extends BaseEmployee13_2 {
    private int numberOfSubordinates;

    public Manager13_2(String name, int age, int salary, char sex, int numberOfSubordinates) {
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
        return (super.getSalary(monthArray) + super.getSalary(monthArray) * getNumberOfSubordinates() / 100);
    }
}

