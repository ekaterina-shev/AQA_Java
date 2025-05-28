package lesson_3.case_1;

public class Product {
    String name;
    String date;
    String manufacturer;
    String country;
    String cost;
    Boolean booking;

    public Product() {
        this.name = "Mango";
        this.date = "15.04.2025";
        this.manufacturer = "King of fruits";
        this.country = "Vietnam";
        this.cost = "5.00$";
        this.booking = true;
        printInfo();
    }

    public void printInfo() {
        System.out.println(
                "Имя: " + name +
                        "\nДата производства: " + date +
                        "\nПроизводитель: " + manufacturer +
                        "\nСтрана: " + country +
                        "\nСтоимость: " + cost +
                        "\nСтатус бронирования: " + booking);
    }
}
