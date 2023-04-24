package lesson13_1;

// Необходимо создать класс Director с теми же методами, что и Manager,
// но метод getSalary должен возвращать результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9).
// Если количество подчиненных 0, то результат как у обычного рабочего.
// Коэффициенты для расчета ЗП у Manager и Director должны быть константами (коэффициенты из формулы расчета ЗП)
// Классы Manager и Director должны быть финальными
final public class Director13_1 extends BaseManager13_1 {
    public static final int SALARY_COEFFICIENT = 9;

    public Director13_1(String name, int baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public int getSalaryCoefficient() {
        return SALARY_COEFFICIENT;
    }

    @Override
    public int getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        }
        return getBaseSalary() * (getNumberOfSubordinates() / 100 * getSalaryCoefficient());
    }
}
