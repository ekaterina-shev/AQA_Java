package lesson_3.case_3;

public class Park {
    String adress;
    String trees;
    String lightning;
    Park.Attraction atraction;

    public class Attraction {
        String name;
        String cost;
        String schedule;

        public Attraction() {
            this.name = name;
            this.cost = cost;
            this.schedule = schedule;
        }
    }
}
