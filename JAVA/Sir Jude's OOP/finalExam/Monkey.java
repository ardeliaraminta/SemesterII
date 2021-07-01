package finalExam;

public class Monkey extends Animal {
    private String favFood;

    public Monkey(String name, int weight) {
        super(name, weight);
    }
    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }
}
