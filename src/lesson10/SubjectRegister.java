package lesson10;

public class SubjectRegister {
    private Row[] rows;

    //для каждого студента создаем новый ряд в журнале в конструкторе
    public SubjectRegister(String[] studentNames, int numberOfClass) {
        this.rows  = new Row[studentNames.length];
        for (int i = 0; i < studentNames.length; i++) {
            Row row = new Row(); //новая строчка
            row.studentName = studentNames[i]; //записываем имя
            row.grades = new Integer[numberOfClass];
            rows[i] = row;
        }
    }
}
