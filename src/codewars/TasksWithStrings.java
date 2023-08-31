package codewars;

import java.math.BigInteger;
import java.util.Arrays;

public class TasksWithStrings {
    public static void main(String[] args) {
        stringToArray("I love arrays they are my favorite");
        System.out.println(strCount("hello", 'l'));
        System.out.println(correct("заменить все единицы на 11, на пятёрки на 55"));
        System.out.println(correct2("заменить все единицы на 11, на пятёрки на 55"));
        System.out.println(add("500", "610"));
        System.out.println("------");
        System.out.println(areYouPlayingBanjo("Martin"));
        System.out.println(areYouPlayingBanjo("Rikke"));
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

    // или короче второй вариант
    public static String correct2(String string) {
        return string.replace("5","S").replace("0", "O").replace("1","I");
    }


    //Напишите функцию, возвращающую сумму двух чисел.
    // Входные числа представляют собой строки, и функция должна возвращать строку.
    //add("123", "321"); -> "444"
    //add("11", "99");   -> "110"
    public static String add(String a, String b) {
        BigInteger firstValue = new BigInteger(a);
        BigInteger secondValue = new BigInteger(b);
        BigInteger resultValue =  firstValue.add(secondValue);
        String str = resultValue.toString();
        return str;
    }

    //Создайте функцию, которая отвечает на вопрос «Вы играете на банджо?».
    //Если ваше имя начинается с буквы «R» или строчной «r», вы играете на банджо!
    //Функция принимает имя в качестве единственного аргумента и возвращает одну из следующих строк:
    //name + " plays banjo"
    //name + " does not play banjo"
    public static String areYouPlayingBanjo(String name) {
        if (Character.toLowerCase(name.toCharArray()[0]) == 'r') {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }
    }
}







