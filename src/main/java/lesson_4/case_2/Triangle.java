package lesson_4.case_2;

public class Triangle implements Form {
    private double a, b, c;
    private String fillColor, borderColor;

    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public boolean isValid() {
        return a + b > c && a + c > b && b + c > a;
    }

    public double getArea() {
        if (!isValid()) {
            System.out.println("Ошибка: такой треугольник не существует");
            return Double.NaN;
        }

        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }
}
