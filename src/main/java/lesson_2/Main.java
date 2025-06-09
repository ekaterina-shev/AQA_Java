package lesson_2;

public class Main {
    public static void main(String[] args)
    {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
    }

    public static void task1()
    {
        printThreeWords();
    }
    public static void printThreeWords ()
    {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void task2()
    {
        checkSumSign();
    }
    public static void checkSumSign()
    {
        int a = -7;
        int b = 3;
        int sum = a + b;
        if (sum > 0) {System.out.println("Сумма положительная"); }
        else {System.out.println("Cумма отрицательная"); }
    }

    public static void task3()
    {
        printColor();
    }
    public static void printColor ()
    {
        int value = 101;
        if (value <=0) {System.out.println("Красный"); }
        else if (value >0 & value <=100) {System.out.println("Желтый"); }
        else if (value >100) {System.out.println("Зеленый"); }
    }

    public static void task4()
    {
        compareNumbers();
    }
    public static void compareNumbers ()
    {
        int a = 4;
        int b = 6;
        if (a >= b) {System.out.println("a >= b"); }
        else {System.out.println("a < b"); }
    }

    public static void task5()
    {
        boolean result = isSumWithinRange();
        System.out.println(result);
    }
    public static boolean isSumWithinRange ()
    {
        int a = 5;
        int b = 5;
        int sum = a + b;
        return sum >= 10 & sum <=20;
    }

    public static void task6()
    {
        printNumberSign();
    }
    public static void printNumberSign()
    {
        int a = 5;
        if (a >=0) System.out.println("Положительное число");
        else if (a < 0) System.out.println("Отрицательное число");
    }

    public static void task7()
    {
        boolean result = isNegative();
        System.out.println(result);
    }
    public static boolean isNegative ()
    {
        int numb = 5;
        return numb < 0;
    }

    public static void task8()
    {
        printStringMultipleTimes();
    }
    public static void printStringMultipleTimes()
    {
        int count = 5;
        for (int i = 0; i < count; i++)
        {System.out.println("Доброго времени суток");}
    }

    public static void task9()
    {
        boolean result = isLeapYear();
        System.out.println(result);
    }
    public static boolean isLeapYear ()
    {
        int year = 2000;
        return (year % 4 == 0 & year % 100 != 0) || (year % 400 == 0);
    }

    public static void task10()
    {
        int[] arr = new int[] {1,0,0,1,0,0,0};
        int a = 1;
        int b = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == a)
            {arr[i] = b;}
            else if (arr[i] == b)
            {arr[i] = a;}

            System.out.println(arr[i]);
        }
    }

    public static void task11()
    {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }

    public static void task12()
    {
        int[] arr = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < 6)
            {arr[i] = arr[i] * 2;}
            System.out.println(arr[i]);
        }
    }

    public static void task13()
    {
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++)
        {
            arr[i][i] = 1;
            arr[i][3-1-i] = 1;
        }

        for (int i = 0; i < 3; i++)
        {
            for (int k = 0; k < 3; k++)
            {
                System.out.print(arr[i][k]);
            }
            System.out.println();
        }
    }

    public static void task14()
    {
        int[] result = createArray(3, 1);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

}
