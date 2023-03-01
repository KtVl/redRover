package lesson2;

public class Homework2 {
    public static void main(String[] args) {
        int a = 58, b = 10;
        System.out.println("a = " + a + "; \nb = " + b + ";");
        System.out.println("число a  четное: " + isOdd(a) + "\nчисло b четное: " + isOdd(b));
        System.out.println(isOdd(b));
        task1(a,b);
        System.out.println("________________");
        extraTask(a,b);
        System.out.println("________________");
        extraTask2();
    }

//    Задача №1
//    Необходимо создать целочисленные переменные a и b,
//    присвоить произвольные значения переменным на ваш выбор
//    и вывести результаты следующих операций с этими переменными:
//    сложение, умножение, вычитание, деление.
    public static void task1(int a, int b) {
        System.out.println("a+b= "+ (a+b) + "\n" + "a*b= " + (a*b) + "\n" + "a-b= " + (a-b) + "\n" + ("a/b= ") + (a/b));
    }

//     вывести остаток от деления и сделать проверку на четность этих переменных.

    public static void extraTask(int a, int b) {
        int num = a % 5;
        int num2 = b % 5;
        System.out.println("остаток от деления a / 5 = " + num + "\n" + "остаток от деления b / 5 = " + num2);
    }
    public static boolean isOdd(int num) {
        return num % 2 == 0;
    }


// Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом)
    public static void extraTask2() {
        String smile = "\uD83D\uDE00";
        System.out.println(smile);

    }
}
