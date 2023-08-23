package codewars;

public class TaskForMath {
    public static void main(String[] args) {
        System.out.println(arithmetic(5,2, "multiply"));
    }

    /*Учитывая два числа и арифметический оператор, верните результат двух чисел, к которым применен этот оператор.
    a и b оба будут положительными целыми числами и a всегда будут первым числом в операции и b всегда вторым.
    Четыре оператора: «сложить», «вычесть», «делить», «умножить».
    Несколько примеров: (Ввод1, Ввод2, Ввод3 --> Вывод)
            5, 2, "add"      --> 7
            5, 2, "subtract" --> 3
            5, 2, "multiply" --> 10
            5, 2, "divide"   --> 2.5 */
    public static int arithmetic(int a, int b, String operator) {
        switch (operator) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                return a / b;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
    }
}
