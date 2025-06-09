package lesson_7;

public class FactorialCalculator {

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Отрицательное значение");
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
