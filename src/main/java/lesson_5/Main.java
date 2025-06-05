package lesson_5;

public class Main {

    public static void main(String[] args) {
        String[][] array = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8",},
                {"9", "10", "11", "12"},
                {"13", "#", "2", "7"}};

        try {
            int result = Array.arr(array);
            System.out.println("Сумма: " + result);
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        try {
            int[] nums = new int[]
                    {1, 2, 3};
            int num1 = nums[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }
}
