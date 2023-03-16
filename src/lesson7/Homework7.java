package lesson7;

public class Homework7 {
    public static void main(String[] args) {
        task2();
        }


    public static void task1() {
        // Необходимо создать класс Person с полями:
// имя, возраст, пол. Класс должен иметь метод - getName,
// метод возвращает имя с префиксом “Mr. ”
// если пол указан как мужской и префикс “Mrs. ” если женский
        Person[] persArrays = {
                new Person("Ivanov Ivan", 0, 30),
                new Person("Ivanova Mariya", 1, 29),
        };

        for (Person persArray : persArrays) {
            if (persArray.getName() == 0) {
                System.out.println("Mr." + persArray);
            }
            if (persArray.getName() == 1) {
                System.out.println("Mrs." + persArray);
            }
        }
    }


    public static void task2() {
        //Необходимо создать класс Employee с полями как у Person
        // (из предыдущего задания) и поле зарплата.
        // Класс должен иметь метод isSameName(Employee employee)
        // который возвращает true, если у сотрудника у которого
        // был вызван метод и сотрудника который был передан как параметр,
        // одинаковое имя.
        Employee employee1 = new Employee("Ivanov Ivan", 0, 30, 34_000);
        Employee employee2 = new Employee("Ivanov Ivan", 0, 29, 55_000);
        Employee employee3 = new Employee("Petrova Natasha", 1, 40, 6_000);
        System.out.println(employee1.isSameName(employee1));
        System.out.println(employee1.isSameName(employee2));
        System.out.println(employee1.isSameName(employee3));
        }
    }