package lesson13_2;
/*Создать класс Month с полями:
имя месяца, количеством дней и количеством рабочих дней.
Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).
Класс Month сделать неизменяемым (immutable).
Статические поля с объектами месяцев должны быть финальными
* */
public class Month {
    private final String namesOfMonths;
    private final int days;
    private final int workingDays;
    private final int numberOfMonths;

    public Month(String namesOfMonths, int days, int workingDays, int numberOfMonths) {
        this.namesOfMonths = namesOfMonths;
        this.days = days;
        this.workingDays = workingDays;
        this.numberOfMonths = numberOfMonths;
    }

    public String getNamesOfMonths() {
        return namesOfMonths;
    }

    public int getDays() {
        return days;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }
}
