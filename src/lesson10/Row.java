package lesson10;

public class Row {
     String studentName;
     Integer[] grades;

    public Row(String studentName, int numberOfLessons) {
        this.studentName = studentName;
        grades = new Integer[numberOfLessons];
    }

    public void giveGrade(int lessonNumber, Integer grade) {
        grades[lessonNumber - 1] = grade;
    }

    public String getStudentName() {
        return studentName;
    }
}
