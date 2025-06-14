package lesson_3.case_2;

public class Product {
    String name;
    String date;
    String manufacturer;
    String country;
    String cost;
    Boolean booking;

    public Product(String name, String date, String manufacturer, String country, String cost, Boolean booking) {
        this.name = name;
        this.date = date;
        this.manufacturer = manufacturer;
        this.country = country;
        this.cost = cost;
        this.booking = booking;
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
