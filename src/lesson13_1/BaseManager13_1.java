package lesson13_1;

public abstract class BaseManager13_1 extends Employee13_1 {
    private int numberOfSubordinates;

    public BaseManager13_1(String name, int baseSalary) {
        super(name, baseSalary);
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public abstract int getSalaryCoefficient();
    public abstract int getSalary();

}
