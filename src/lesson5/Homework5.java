package lesson5;

public class Homework5 {
    public static void main(String[] args) {
        task3();
    }

    public static void task1() {
         /* Задача №1
0  1  2  3  4  5  6  7  8  9
0  1  2  3  4  5  6  7  8
0  1  2  3  4  5  6  7
0  1  2  3  4  5  6
0  1  2  3  4  5
0  1  2  3  4
0  1  2  3
0  1  2
0  1
0
*/
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }

    public static void task2(){
       /* Задача №2
   0  1  2  3  4  5  6  7  8  9
      0  1  2  3  4  5  6  7  8
         0  1  2  3  4  5  6  7
            0  1  2  3  4  5  6
               0  1  2  3  4  5
                  0  1  2  3  4
                     0  1  2  3
                        0  1  2
                           0  1
                              0

 */
        for (int i = 10; i > 0; i--) {
            for (int j = 10; j > i; j--){
                System.out.print(" " + " ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }

            System.out.println(" ");
        }
    }

    public static void task3() {
        /* 9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
             8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
               7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
                 6 5 4 3 2 1 0 1 2 3 4 5 6
                   5 4 3 2 1 0 1 2 3 4 5
                     4 3 2 1 0 1 2 3 4
                       3 2 1 0 1 2 3
                         2 1 0 1 2
                           1 0 1
                             0 */


        for (int i = 9; i >= 0; i--) {

            //Левая часть треугольника
            for (int j = 9; j > i; j--){
                System.out.print(" " + " "); //пробелы
            }

            for (int k = 0; k < i; k++){
                System.out.print(i-k + " ");
            }

            //Правая часть треугольника
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = 10; j > i; j--) {
                System.out.print(" "); //пробелы
            }

            System.out.println();
        }
    }
}


