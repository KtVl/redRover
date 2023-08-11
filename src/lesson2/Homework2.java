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

        divideTheLoot();
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

    /*Создать программу дележа добычи на пиратском корабле. По обычаю, половина добычи идет владельцу корабля,
    половина оставшегося — капитану, остальное делится поровну между всеми членами команды, включая капитана.
    Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.
    Вывести на экран кому сколько пиастров полагается.*/

    public static void divideTheLoot() {
        double miningSize = 100;
        double numberOfPirates = 10;
        double shipOwner = miningSize / 2;
        double captain = shipOwner / 2;
        double teamMembers = captain / numberOfPirates;

        System.out.println("владельцу: " + shipOwner + "\n"
                + "капитану: " + (captain + teamMembers) +"\n"
                + "каждому члену корабля: " + teamMembers);

    }
}
