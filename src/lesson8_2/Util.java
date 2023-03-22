package lesson8_2;

public class Util {

    //поиск сотрудника в массиве по его имени
    public static boolean searchByName(String name, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (name.equals(employees[i].getName())) {
                return true;
            }
        } return false;
    }

    //поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static boolean searchSubByName(String name, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().contains(name)) {
                return true;
            }
        } return false;
    }

    //подсчет зарплатного бюджета для всех сотрудников в массиве
    public static int sumSalary(Employee[] employees){
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getBaseSalary();
        } return sum;
    }

    //поиск наименьшей зарплаты в массиве
    public static int minSalary(Employee[] employees) {
        int min = employees[0].getBaseSalary();
        for (int i = 0; i < employees.length; i ++){
            if (min > employees[i].getBaseSalary()) {
                min = employees[i].getBaseSalary();
            }
        } return min;
    }

    //поиск наибольшей зарплаты в массиве
    public static int maxSalary(Employee[] employees) {
        int max = employees[0].getBaseSalary();
        for (int i = 0; i < employees.length; i ++){
            if (max < employees[i].getBaseSalary()) {
                max = employees[i].getBaseSalary();
            }
        } return max;
    }
}
