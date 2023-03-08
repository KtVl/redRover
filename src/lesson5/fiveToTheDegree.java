package lesson5;

import java.util.Arrays;

public class fiveToTheDegree {
    public static void main(String[] args) {
        //вывести степени числа 5
        int[] arr = new int[6];
        int p = 1;
        for (int i = 0; i < arr.length; i++){
            arr[i] = p;
            p *= 5;
        }
        System.out.println(Arrays.toString(arr));
    }
}
