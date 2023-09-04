package codewars;

import java.util.Arrays;

public class TasksWithArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(between(1,4)));
        System.out.println(Arrays.toString(digitize(12345)));
        String str = "11 34 3 45 23 5 67";
        System.out.println(Arrays.toString(stringInInt(str)));

        System.out.println("----------");

        int[][] a = new int[][] { { 3, 4, 4 }, { 6, 4, 4 }, { 2, 2, 4 } };
        int[][] b = new int[][] { { 1, 1, 1 }, { 4, 6, 6 }, { 2, 2, 4 } };
        System.out.println(Arrays.deepToString(matrixAddition(a,b)));
    }

    //Завершите функцию, которая принимает два целых числа ( a, b, где a < b),
    // и верните массив всех целых чисел между входными параметрами, включая их.
    //a = 1
    //b = 4
    //--> [1, 2, 3, 4]
    public static int[] between(int a, int b) {
        int[] arr = new int[b - (a - 1)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a + i;
        } return arr;
    }

    //Учитывая случайное неотрицательное число, вы должны вернуть цифры этого числа в массиве в обратном порядке.
    //35231 => [1,3,2,5,3]
    //0 => [0]
    public static char[] digitize(long n) {
        String str = String.valueOf(n);
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result.toCharArray();
    }

    //на вход дана строка. вывести в качестве массива int
    public static int[] stringInInt(String str) {
        String strArr[] = str.split(" ");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        } return numArr;
    }

    //Напишите функцию, которая принимает две квадратные матрицы (N x N двумерные массивы)
    // и возвращает их сумму. Обе матрицы, передаваемые в функцию,
    // будут иметь размер N x N(квадратный) и содержать только целые числа.
    public static int[][] matrixAddition(int[][] a, int[][] b) {
        int[][] sum = new int[a.length][a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        } return sum;
    }
}
