package lesson10;

public class Row {
     String studentName;
     Integer[] grades;

    public Row(String studentName, int numberOfLessons) {
        this.studentName = studentName;
        grades = new Integer[numberOfLessons];
    }
}
