package lesson_3.case_3;

public class Main {
    public static void main(String[] args) {
        Park park = new Park();
        Park.Attraction atr1 = park.new Attraction();
        atr1.name = "Roller Coaster";
        atr1.cost = "5BYN";
        atr1.schedule = "10:00 - 21:00";
        System.out.println("Название аттракциона: " + atr1.name);
        System.out.println("Стоимость: " + atr1.cost);
        System.out.println("Время работы: " + atr1.schedule);
    }
}
