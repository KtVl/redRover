package lesson10;

public class SubjectRegister {
    private Row[] rows;

    //для каждого студента создаем новый ряд в журнале в конструкторе
    public SubjectRegister(String[] studentNames, int numberOfClass) {
        this.rows  = new Row[studentNames.length];
        for (int i = 0; i < studentNames.length; i++) {
            Row row = new Row(studentNames[i], numberOfClass); //новая строчка
            rows[i] = row;
        }
    }

    //показать сколько учеников в классе
    public int getNumberOfStudents() {
        return rows.length;
    }
}
