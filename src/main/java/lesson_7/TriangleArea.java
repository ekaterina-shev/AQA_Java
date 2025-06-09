package lesson_7;

public class TriangleArea {

    public static double calculateArea(double base, double height) {
        if (base <= 0 || height <= 0)
            throw new IllegalArgumentException("Значения должны быть положительными");
        return 0.5 * base * height;
    }
}
