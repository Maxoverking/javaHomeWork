package students;

public class Main {
    public static void main(String[] args) {
        Students students = new Students("Max", "24");
        System.out.println("students: " + students);
        Students students1 = Students.parseStudents("gpoup", "max");
        System.out.println("students1: " + students1);

    }

}
