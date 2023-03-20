package lesson8;

public class Homework8 {
    public static void main(String[] args) {
// Необходимо создать класс Employee с полями:
// имя, возраст, пол и ЗП в день.
// Все поля сделать приватными и для каждого поля добавить методы set и get.
// Класс должен иметь метод - getSalary(int days),
// метод возвращает зарплату за количество дней которые были переданы в качестве аргумента.
        Employee employee = new Employee("Name", 1, 23, 2000);
        System.out.println(employee.getSalary(2));

        System.out.println("---------------");
// Необходимо создать класс Manager с полями:
// имя, возраст, пол, ЗП в день и количество подчиненных.
// Все поля сделать приватными и для каждого поля добавить методы set и get.
// Класс должен иметь метод - getSalary(int days),
// метод возвращает зарплату за количество дней которые были переданы в качестве аргумента.

        Manager manager = new Manager("Name", 1, 23, 2000, 1);
        System.out.println(manager.getSalary(1));

        //К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.

        System.out.println(manager.persent(manager.getSalary(1)));
    }
}
