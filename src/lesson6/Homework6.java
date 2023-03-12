package lesson6;

import java.util.Arrays;

public class Homework6 {
    public static void main(String[] args) {
        task7();
    }


    public static void task7() {
        // Дан массив:
        //int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //необходимо вывести количество элементов в массиве.
        System.out.println("Дан массив: {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}}");
        int[][] arr = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {-1, -2, -3, -4},
                {-5, -6}};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                count ++;
            }
        }
        System.out.println("вывести количество элементов в массиве: " + count);
    }


    public static void task6() {
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести максимальное значение массива.
        System.out.println("Дан массив: {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}}");
        int[][] arr = { { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9 },
                { -1, -2, -3, -4 },
                {-5, -6} };
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i ++){
            for (int j = 0; j < arr[i].length; j++){
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("max = " + max);
    }



    public static void task5() {
        //Дан массив:
        //int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //необходимо вывести сумму элементов массива.
        System.out.println("Дан массив: {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}}");
        int[][] array2D = { { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9 },
                { -1, -2, -3, -4 },
                {-5, -6} };
        int sum = 0;
        for (int i = 0; i < array2D.length; i++) { // для перебора элементов массива ссылок
            for (int j = 0; j < array2D[i].length; j++) {
                sum = array2D[i][j];
            }
        }
        System.out.println("sum = " + sum);
    }

    public static void task4() {
        //Дан массив:
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //необходимо вывести среднее арифметическое всех значений массива.
        System.out.println("Дан массив: {9, 2, 6, 4, 5, 12, 7, 8, 6}");
        int[] arr = { 9, 2, 6, 4, 5, 12, 7, 8, 6 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int sum2 = sum / arr.length;
        System.out.println(sum2);
    }


    public static void task3() {
        // Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести минимальное значение массива.
        System.out.println("Дан массив: {9, 2, 6, 4, 5, 12, 7, 8, 6}");
        int[] arr = { 9, 2, 6, 4, 5, 12, 7, 8, 6 };
        Arrays.sort(arr);
        System.out.println("вывести минимальное значение массива: " + arr[0]);
    }


    public static void task2() {
        // Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести максимальное значение массива.
        System.out.println("Дан массив: {9, 2, 6, 4, 5, 12, 7, 8, 6}");
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        Arrays.sort(array); // метод упорядочивания элементов массива
        int lastItem = array[array.length - 1];
        System.out.print("максимальное число в массиве: " + lastItem);
    }


    public static void task1(){
        // Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести сумму всех значений массива.
        System.out.println("Дан массив: {9, 2, 6, 4, 5, 12, 7, 8, 6}");
        int[] myArray = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println(sum);

    }
}

