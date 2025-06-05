package lesson_6.case_1;

import java.util.List;

public class Students {
    public String name;
    public int group;
    public int course;
    public int previousCourse;
    public List<Integer> grades;

    public Students(String name, int group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
        this.previousCourse = course;
    }

    public float getAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return grades.size() == 0 ? 0 : (float) sum / grades.size();
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getPreviousCourse() {
        return previousCourse;
    }

    public void setPreviousCourse(int previousCourse) {
        this.previousCourse = previousCourse;
    }

    public String toString() {
        return "Студент: " + name + ", группа: " + group + ", курс: " + course + ", средний балл: " + getAverageGrade();
    }
}
