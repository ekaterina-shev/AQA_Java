package lesson_6.case_1;

import java.util.List;

public class StudentManager {
    public static void remove(List<Students> students) {
        students.removeIf(s -> s.getAverageGrade() < 3);
    }

    public static void promote(List<Students> students) {
        for (Students s : students) {
            if (s.getAverageGrade() >= 3) {
                s.setPreviousCourse(s.getCourse());
                s.setCourse(s.getCourse() + 1);
            }
        }
    }
}
