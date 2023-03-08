package lesson5;

import java.util.Arrays;

public class arrayArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 10, 100},
                {2, 20},
                {3, 30, 300, 3000}
        };
//        System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
            System.out.println(arr[i][j]);
        }
    }
}
