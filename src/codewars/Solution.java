package codewars;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // Напишите функцию, которая разбивает строку и преобразует ее в массив слов.
        stringToArray("I love arrays they are my favorite");
    }

    public static String[] stringToArray(String s) {
        System.out.println(Arrays.toString(s.split(" ")));
        return new String[0];
    }
}







