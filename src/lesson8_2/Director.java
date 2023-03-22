package lesson8_2;

public class Director extends Manager {
    private int SalaryDirector;

    public Director(String name, int baseSalary, int salaryWorker, int numberOfSubordinates, int salaryManager, int salaryDirector) {
        super(name, baseSalary, salaryWorker, numberOfSubordinates, salaryManager);
        SalaryDirector = salaryDirector;
    }

    public int getSalaryDirector() {
        // <базовая ставка> * (<количество подчиненных> / 100 * 9)
        SalaryDirector = getSalaryWorker() * (getNumberOfSubordinates() / 100 * 9);
        if (getNumberOfSubordinates() == 0) {
            return getSalaryWorker();
        }
        return SalaryDirector;
    }
}
