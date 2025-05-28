package lesson_4.case_1;

public class Dog extends Animal {
    public static int dogCount = 0;
    private static final int maxRunDistance = 500;
    private static final int maxSwimDistance = 10;

    public Dog(String name) {
        super(name);
        dogCount++;
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
        if (distance <= maxSwimDistance) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть больше " + maxSwimDistance + " м.");
            System.out.println("----------------------------------------------------------------");
        }
    }

}
