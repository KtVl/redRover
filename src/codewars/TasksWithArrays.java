package codewars;

import java.util.Arrays;

public class TasksWithArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(between(1,4)));
        System.out.println(Arrays.toString(digitize(12345)));
        String str = "11 34 3 45 23 5 67";
        System.out.println(Arrays.toString(stringInInt(str)));
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
}
