package finalExam;

public class Snake extends Animal {
    private int lengthSnake;

    public Snake(String name, int weight) {
        super(name, weight);
    }

    public int getLengthSnake() {
        return lengthSnake;
    }

    public void setLengthSnake(int lengthSnake) {
        this.lengthSnake = lengthSnake;
    }
}
