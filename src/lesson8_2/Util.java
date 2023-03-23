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

    //поиск наименьшего количества подчиненных в массиве менеджеров
    public static int minCountOfSubordinates(Worker[] manager) {
        int min = manager[0].getNumberOfSubordinates();
        for (int i = 0; i < manager.length; i ++){
            if (min > manager[i].getNumberOfSubordinates()) {
                min = manager[i].getNumberOfSubordinates();
            }
        } return min;
    }

    //поиск наибольшего количества подчиненных в массиве менеджеров
    public static int maxCountOfSubordinates(Worker[] manager) {
        int min = manager[0].getNumberOfSubordinates();
        for (int i = 0; i < manager.length; i ++){
            if (min < manager[i].getNumberOfSubordinates()) {
                min = manager[i].getNumberOfSubordinates();
            }
        } return min;
    }

    //поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
    public static double maxAllowance(Worker[] manager) {
        double allowance = (manager[0].baseSalary + manager[0].baseSalary / 100  * maxCountOfSubordinates(manager) * 3) - manager[0].baseSalary;
        return allowance;
    }

    //поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров
    public static double minAllowance(Worker[] manager) {
        double allowance = (manager[0].baseSalary + manager[0].baseSalary / 100  * minCountOfSubordinates(manager) * 3) - manager[0].baseSalary;
        return allowance;
    }
}
