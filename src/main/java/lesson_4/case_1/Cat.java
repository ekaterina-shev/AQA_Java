package lesson_4.case_1;

public class Cat extends Animal {
    public static int catCount = 0;
    private static final int maxRunDistance = 200;
    private boolean satiety = false;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать больше " + maxRunDistance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
        System.out.println("----------------------------------------------------------------");
    }

    public void eat(int appetite, Bowl bowl) {
        System.out.println(name + " пытается съесть " + appetite + " еды.");
        if (bowl.decreaseFood(appetite)) {
            satiety = true;
            System.out.println(name + " поел.");
        } else {
            System.out.println(name + " не поел — не хватает еды.");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

}
