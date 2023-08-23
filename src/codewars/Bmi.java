package codewars;

public class Bmi {
    public static void main(String[] args) {
        System.out.println(bmi(44, 1.65));
    }

    //Напишите функцию bmi, которая вычисляет индекс массы тела (bmi = вес / рост 2 ).
    //если ИМТ <= 18,5, вернуть "Underweight"
    //если ИМТ <= 25,0, вернуть "Normal"
    //если ИМТ <= 30,0 вернуть "Overweight"
    //если ИМТ > 30, верните "Obese".
    public static String bmi(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);
        if ( bmi <= 18.5) return "Underweight";
        if ( bmi <= 25) return "Normal";
        if ( bmi <= 30) return "Overweight";
        return "Obese";
    }
}
