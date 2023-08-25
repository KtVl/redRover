package lesson6;

import java.util.Arrays;

public class Homework6_3 {
    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(subtract(2, 3));
        System.out.println(multiply(2, 3));
        System.out.println(divide(6, 2));
        System.out.println(countingSheep(4));
        System.out.println(Arrays.toString(countingSheepArray(4)));
    }

    //Необходимо написать 4 метода:
    //сложение 2х чисел
    //вычитание 2х чисел
    //умножение 2х чисел
    //деление 2х чисел
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    //Например, если задано неотрицательное целое число, верните строку с ропотом:
    // "1 sheep...2 sheep...3 sheep...".
    // Ввод всегда будет действительным, т.е. отрицательных целых чисел не будет.
    public static String countingSheep(int num) {
        String res = "";
        for (int i = 1; i <= num; i++) {
            res = res + i + " sheep...";
        }
        return res;
    }

    public static String[] countingSheepArray(int num) {
        String[] array = new String[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) + " sheep...";
        }
        return array;
    }
}
