package lesson13_1;

//  Необходимо создать класс Worker где метод getSalary будет возвращать базовую ставку и должен быть финальным.
public class Worker13_1 extends Employee13_1{
    public Worker13_1(String name, int baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public final int getSalary() {
        return getBaseSalary();
    }

}
