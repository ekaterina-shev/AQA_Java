package lesson_6.case_2;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory ph = new PhoneDirectory();

        ph.add("Иванов", "+375259856452");
        ph.add("Петров", "+375446598526");
        ph.add("Иванов", "+375335642583");
        ph.add("Макарова", "+375335252583");

        System.out.println("Иванов:");
        for (String number : ph.get("Иванов")) {
            System.out.println(number);
        }

        System.out.println("\nМакарова:");
        for (String number : ph.get("Макарова")) {
            System.out.println(number);
        }

        System.out.println("\nПетров:");
        for (String number : ph.get("Петров")) {
            System.out.println(number);
        }
    }
}
