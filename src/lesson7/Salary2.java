package lesson7;

public class Salary2 {
    public static double getSum(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        } return sum;
    }
}

