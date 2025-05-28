package lesson_4.case_2;

public class Main {
    public static void main(String[] args) {
        Form[] forms = new Form[]{
                new Circle(9, "Серый", "Голубой"),
                new Rectangle(10, 6, "Малиновый", "Черный"),
                new Triangle(25, 15, 17, "Коричневый", "Белый")
        };

        for (Form form : forms) {
            form.printInfo();
        }
    }
}
