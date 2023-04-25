package lesson15;
import java.util.Comparator;
import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {

        LinkedList<Employee> list = new LinkedList<>();
        list.add(new Employee("John", 200));
        list.add(new Employee("Mary", 210));
        list.add(new Employee("Sally", 150));
        list.sort(new SalaryComparator()); //сортировка
        printList(list);
    }

    static class Employee {

        private String name;
        private int salary;

        public Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }
    }

    static class SalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getSalary() - o2.getSalary();
        }
    }

    public static void printList(LinkedList<Employee> list){
        for (Employee s: list) {
            System.out.println(s.getName() + ": " + s.getSalary());
        }
    }
}
