package finalExam;

public class Snake extends Animal {
    private int lengthSnake;

    @Override
    public String toString() {
        return "Snake: " + " Name: " + name + '\'' +
                ", Weight:" + weight +
                ", length of the snake: " + lengthSnake +
                " feet";
    }

    public Snake(String name, int weight, int lengthSnake) {
        super(name, weight);
        this.lengthSnake = lengthSnake;
    }

    public int getLengthSnake() {
        return lengthSnake;
    }

    public void setLengthSnake(int lengthSnake) {
        this.lengthSnake = lengthSnake;
    }
}
