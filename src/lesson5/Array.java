package lesson5;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr1 = {10, 100, 1000, 50};
        int[] arr2 = arr1;
        arr2[0] = 20;
        System.out.println(Arrays.toString(arr1));
    }
}
