package lesson_6.case_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Students> students = new ArrayList<>();
        students.add(new Students("Виктор", 123, 1, Arrays.asList(9, 7, 8)));
        students.add(new Students("Василий", 352, 1, Arrays.asList(3, 2, 3)));
        students.add(new Students("Анатолий", 289, 2, Arrays.asList(5, 6, 7)));

        System.out.println("Список студентов:");
        for (Students s : students) {
            System.out.println(s);
        }

        StudentManager.remove(students);
        StudentManager.promote(students);

        System.out.println("\nСтуденты, перешедшие на следующий курс:");
        for (Students s : students) {
            if (s.getCourse() > s.getPreviousCourse()) {
                System.out.println(s);
            }
        }
    }
}