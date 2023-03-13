package lesson6;
import  java.util.Arrays;

public class Homework6_2 {
    public static void main(String[] args) {

        extra();
    }

    public static void extra() {
        // Дан массив:
        //String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
        //необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”
        String[][] array = {{"Привет", "всем", "кто" }, {"изучает", "язык", "программирования" }, {"java"}};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!(array[i][j].contains("е"))) {
                count++;
                }
            }

        }System.out.println(count);
    }


    public static void task3() {
        // Дана строка:
        //String s = “Посмотрите как Рите нравится ритм”;
        //необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
        //Для указанной строки ответ будет 6, 15, 29.
            String str = "Посмотрите как Рите нравится ритм";
            String str2  = str.toLowerCase(); //приводим строку к нижнему регистру
            str = str2;

            int index = str.indexOf("рит");
            while (index != -1) {
                System.out.println(index);
                index = str.indexOf("рит", index + 1);
            }
        }


    public static void task2() {
        // Дана строка:
        //String s = “Перевыборы выбранного президента”;
        //необходимо подсчитать количество букв “е” в строке.
        //Для указанной строки ответ будет 4.
        String s = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е') {
                count++;
            }
        }
        System.out.println(count);
    }


    public static void task1() {
        //Дана строка:
        //String s = “Перестановочный алгоритм быстрого действия”;
        //необходимо вывести все буквы “о” из этой строки.
        //Для указанной строки ответ будет “ооооо” (или в столбик)
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'о') {
                System.out.print('o');
            }
        }
        System.out.println();
    }
}
