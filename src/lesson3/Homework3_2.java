package lesson3;

public class Homework3_2 {
    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
    }

    //Необходимо вывести числа от 0 до 15
    public static void task1() {
        int a = 0;
        while (a < 16) {
            System.out.println(a);
            a++;
        }
    }

    //Необходимо вывести все положительные степени числа 5 которые меньше 10_000, вывести результат возведения в степень
    public static void task2() {
        int number = 5;
        int result = 1;      // Результат возведения в степень
        int pow = 1;        // Начальный показатель степени
        do {
            System.out.println(number + " в степени " + pow + " = " + result);
            pow++;
            result = result * number;
        } while (result < 10_000);      // условие выхода из цикла
    }

    // Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
    //Реализовать 2 варианта:
    //использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
    //без использования конструкции if (шаг цикла на ваше усмотрение).
    public static void task3() {
        int start = 40;
        int off = 61;
        for (int i = start; i < off; i++) {
            if (i % 4 == 0) {
//                i = i + 4; без иф.  + поменять начальный диапазон
                System.out.println(i);
            }
        }
    }
}


