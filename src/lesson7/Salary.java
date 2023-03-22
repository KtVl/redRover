package lesson7;

public class Salary {
    private int Salary;

    public Salary(int salary) {
        Salary = salary;
    }

    public int getSalary(Salary[] employeeArray) {
        return Salary;
    }

    public static int sumSalary(Salary[] employeeArray) {
        int sum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            sum += employeeArray[i].getSalary(employeeArray);
        } return sum;
    }
}
