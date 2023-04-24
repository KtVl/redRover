package lesson13_1;
// Необходимо создать класс Manager в который нужно добавить следующие методы:
//getNumberOfSubordinates - получить количество подчиненных
//setNumberOfSubordinates
//  в классе, метод getSalary будет возвращать значение по формуле -
//  <базовая ставка> * (<количество подчиненных> / 100 * 3).
//  Если количество подчиненных 0, то результат как у обычного рабочего.

 final public class Manager13_1 extends BaseManager13_1 {
     public static final int SALARY_COEFFICIENT = 3;

     public Manager13_1(String name, int baseSalary) {
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
