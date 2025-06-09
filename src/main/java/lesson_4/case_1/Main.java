package lesson_4.case_1;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Боня");
        Cat cat1 = new Cat("Блинчик");

        dog1.run(501);
        dog1.swim(11);

        cat1.run(30);
        cat1.swim(5);

        Bowl bowl = new Bowl(30);
        bowl.info();
        cat1.eat(9, bowl);
        System.out.println(cat1.name + (cat1.isSatiety() ? " сыт." : " голоден."));
        System.out.println("----------------------------------------------------------------");
        bowl.info();

        Cat[] cats = {
                new Cat("Снежок"),
                new Cat("Кружок"),
                new Cat("Виток"),
                new Cat("Холодок")
        };

        int[] appetites = {17, 31, 20, 30};
        for (int i = 0; i < cats.length; i++) {
            while (!cats[i].isSatiety()) {
                cats[i].eat(appetites[i], bowl);
                System.out.println(cats[i].name + ": " + (cats[i].isSatiety() ? "сыт." : "голоден."));
                System.out.println("----------------------------------------------------------------");
                if (!cats[i].isSatiety()) {
                    System.out.println("Недостаточно еды для " + cats[i].name + ", добавляем в миску...");
                    bowl.addFood(20);
                }
            }
        }

        System.out.println("\nСоздано:");
        System.out.println("Количество котов: " + Cat.catCount);
        System.out.println("Количество собак: " + Dog.dogCount);
        System.out.println("Общее количество: " + Animal.animalCount);
    }
}
