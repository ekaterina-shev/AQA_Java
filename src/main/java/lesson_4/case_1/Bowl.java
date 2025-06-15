package lesson_4.case_1;

public class Bowl {

    private int food;

    public Bowl(int food) {
        this.food = Math.max(food, 0);
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("Добавлено " + amount + " еды. Сейчас в миске: " + food + " еды.");
            System.out.println("----------------------------------------------------------------");
        }
    }

    public boolean decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void info() {
        System.out.println("В миске в наличии: " + food + " еды.");
    }
}
