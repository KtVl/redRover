package lesson8_2;

public class Manager extends Worker {
    private int NumberOfSubordinates;
    private int SalaryManager;

    public Manager(String name, int baseSalary, int salaryWorker, int numberOfSubordinates, int salaryManager) {
        super(name, baseSalary, salaryWorker);
        NumberOfSubordinates = numberOfSubordinates;
        SalaryManager = salaryManager;
    }

    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        NumberOfSubordinates = numberOfSubordinates;
    }

    public int getSalaryManager() {
        // <базовая ставка> * (<количество подчиненных> / 100 * 3)
        SalaryManager = getSalaryWorker() * (getNumberOfSubordinates() / 100 * 3);
        if (getNumberOfSubordinates() == 0) {
            return getSalaryWorker();
        }
        return SalaryManager;
    }
}
