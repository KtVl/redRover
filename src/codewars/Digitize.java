package codewars;

import java.util.Arrays;

public class Digitize {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(12345)));
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
}
