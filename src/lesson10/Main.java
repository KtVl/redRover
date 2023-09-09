package lesson10;

public class Main {
    public static void main(String[] args) {
        SubjectRegister biology7a = new SubjectRegister(
                new String[] {
                        "Ivanov",
                        "Petrov",
                        "Sidorov"
                }, 20
        );

        System.out.println(biology7a.getNumberOfStudents());
        biology7a.giveGrade("Ivanov", 1, 5);
        biology7a.print();
    }
}
