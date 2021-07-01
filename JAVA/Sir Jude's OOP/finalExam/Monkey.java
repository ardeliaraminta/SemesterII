package finalExam;

public class Monkey extends Animal {
    //variables for favorite food
    private String favFood;

    @Override
    public String toString() {
        return "Monkey: " + " Name: " + name + '\'' +
                ", Weight:" + weight +
                ", Favorite food: " + favFood;
    }

    //constructor
    public Monkey(String name, int weight, String favFood) {
        super(name, weight);
        this.favFood = favFood;
    }
    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }
}
