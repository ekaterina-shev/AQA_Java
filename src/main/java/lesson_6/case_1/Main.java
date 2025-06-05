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

        students.removeIf(s -> s.getAverageGrade() < 3);

        for (Students s : students) {
            if (s.getAverageGrade() >= 3) {
                s.previousCourse = s.course;
                s.course++;
            }
        }

        System.out.println("\nСтуденты, перешедшие на следующий курс:");
        for (Students s : students) {
            if (s.course > s.previousCourse) {
                System.out.println(s);
            }
        }

    }
}
