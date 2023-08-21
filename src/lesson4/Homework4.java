package lesson4;
import java.util.Arrays;

public class Homework4 {
    public static void main(String[] args) {
//      task1();
//      task2();
//      task3();
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println(task4(array));
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        task5(arr);
        System.out.println(task6(arr));
        System.out.println(Arrays.toString(task7(10)));
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
        int result = 5;      // Результат возведения в степень
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

    //Дан массив:
    //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    //необходимо вывести сумму всех значений массива.
    public static int task4(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    //Дан массив произвольных целых чисел.
    //необходимо подсчитать количество положительных и отрицательных чисел в этом массиве.
    public static void task5(int[] array) {
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0) {
                negativeNumbers += 1;
            } else {
                positiveNumbers += 1;
            }
        }
        System.out.println("положительных: " + positiveNumbers + " отрицательных: " + negativeNumbers);
    }

    //Дан массив произвольных целых чисел.
    //проверить, отсортирован ли он, т.е. все ли числа в массиве стоят так,
    // что каждое следующее число больше предыдущего.
    public static boolean task6(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        } return true;
    }

    //Дано положительное целое число n.
    //создать ряд из n чисел так, чтобы:
    //первые два элемента ряда равнялись 1
    //любой другой элемент ряда был суммой двух предыдущих.
    //Пример:
    //1, 1, 2, 3, 5, 8, …
    public static int[] task7(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i -1] + arr[i -2];
        } return arr;
    }
}


