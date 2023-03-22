package lesson8_2;

public class Worker extends Employee {
    private int SalaryWorker;

    public Worker(String name, int baseSalary, int salaryWorker) {
        super(name, baseSalary);
        SalaryWorker = salaryWorker;
    }

    public int getSalaryWorker() {
        return SalaryWorker;
    }
}
