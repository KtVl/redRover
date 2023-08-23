package codewars;

import java.util.Arrays;

public class TasksWithStrings {
    public static void main(String[] args) {
        stringToArray("I love arrays they are my favorite");
        System.out.println(strCount("hello", 'l'));
        System.out.println(correct("заменить все единицы на 11, на пятёрки на 55"));
    }

    // Напишите функцию, которая разбивает строку и преобразует ее в массив слов.
    public static String[] stringToArray(String s) {
        System.out.println(Arrays.toString(s.split(" ")));
        return new String[0];
    }

    //Создайте функцию, которая принимает строку и один символ и возвращает целое число,
    // соответствующее количеству вхождений второго аргумента в первом.
    //Если вхождений не найдено, должно быть возвращено число 0.
    //("Hello", "o")  ==>  1
    //("Hello", "l")  ==>  2
    //("", "z")       ==>  0
    public static int strCount(String str, char letter) {
        int numberOfRepeat = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == letter) {
                numberOfRepeat ++;
            }
        } return numberOfRepeat;
    }

    // заменить в строке все
    // 5 -> S
    // 0 -> O
    // 1 -> I
    public static String correct(String string) {
        if(string.contains("5") == true) {
            string = string.replaceAll("5", "S");
        }
        if (string.contains("0") == true) {
            string =  string.replaceAll("0", "O");
        }
        if (string.contains("1") == true) {
            string = string.replaceAll("1", "I");
        }
        return string;
    }
}







