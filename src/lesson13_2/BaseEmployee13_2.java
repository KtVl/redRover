package lesson13_2;
/*Для следующих задач надо выполнить условия:
Необходимо создать базовый абстрактный класс BaseEmployee как общего родителя
Классы Employee и Manager должны быть финальными
*/
public abstract class BaseEmployee13_2 {
    private String name;
    private int age;
    private int salaryDay;
    private char sex;

    public BaseEmployee13_2(String name, int age, int salary, char sex) {
        this.name = name;
        this.age = age;
        this.salaryDay = salary;
        this.sex = sex;
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

    public int getSalaryDay() {
        return salaryDay;
    }

    public void setSalaryDay(int salaryDay) {
        this.salaryDay = salaryDay;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getSalary(MonthUtils.Month[] monthArray) {
        int sum = 0;
        for (int i = 0; i < monthArray.length; i++) {
            sum += getSalaryDay() * monthArray[i].getWorkingDays();
        }
        return sum;
    }
}
