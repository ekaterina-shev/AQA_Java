package lesson_4.case_2;

public interface Form {
    double getArea();

    double getPerimeter();

    String getFillColor();

    String getBorderColor();

    default void printInfo() {
        System.out.println("Фигура: " + this.getClass().getSimpleName());
        System.out.printf("Площадь: %.2f\n", getArea());
        System.out.printf("Периметр: %.2f\n", getPerimeter());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println("-----------------------------");
    }
}
