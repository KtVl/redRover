package codewars;

import java.util.Arrays;

public class TasksWithStrings {
    public static void main(String[] args) {
        stringToArray("I love arrays they are my favorite");
        System.out.println(strCount("hello", 'l'));
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

}







