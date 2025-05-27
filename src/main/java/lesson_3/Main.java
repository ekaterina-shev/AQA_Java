package lesson_3;

public class Main {
    public static void main(String[] args){
        Product prod1 = new Product();
//        taskProd();
//        taskpark();


}


public static void taskpark()
{
    Park park = new Park();
    Park.Attraction atr1 = park.new Attraction();
    atr1 .name = "Roller Coaster";
    atr1 .cost = "5BYN";
    atr1 .schedule = "10:00 - 21:00";
    System.out.println("Название аттракциона: " + atr1 .name);
    System.out.println("Стоимость: " + atr1 .cost);
    System.out.println("Время работы: " + atr1 .schedule);
}

public static void taskProd() {
    Product[] arr = new Product[5];
    arr[0] = new Product("Banana", "05.05.2025", "King of fruits", "Vietnam", "2.00$", false);
    arr[1] = new Product("Orange", "21.04.2025", "King of fruits", "Vietnam", "3.00$", false);
    arr[2] = new Product("Mango", "19.03.2025", "King of fruits", "Vietnam", "5.00$", true);
    arr[3] = new Product("Passion fruit", "16.04.2025", "King of fruits", "Vietnam", "6.00$", true);
    arr[4] = new Product("Coconut", "21.02.2025", "King of fruits", "Vietnam", "5.50$", false);
    for (Product p : arr) {
        System.out.println();
        p.printInfo();
    }
}
}
