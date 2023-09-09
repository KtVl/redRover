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

    //поставить оценку ученику
    public void giveGrade(String studentName, int lessonNumber, Integer grade) {
        //найти ряд с учеником
        Row row = findByName(studentName);
        if (row != null){
            //поставить оценку в нужный ряд нужному ученику
            row.giveGrade(lessonNumber, grade);
        } else {
            System.out.println("не найден студент " + studentName);
        }
    }

    //метод поиска ученика
    private Row findByName(String studentName) {
        for (int i = 0; i < rows.length; i++) {
            if (rows[i].getStudentName().equalsIgnoreCase(studentName)) {
                return rows[i];
            }
        }
        return null;
    }
}
