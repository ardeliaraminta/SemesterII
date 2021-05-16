package Week9;

public class Main {
    public static void main(String[] args) {

        Animals turtle = new Animals();
        Animals shark = new Reptile();

        // both has the same sound of eating ( static) 
        turtle.eatFood();
        shark.eatFood();

        // by removing the word static for both turtle and shark has different sound  ( dynamic )
        turtle.swim();
        shark.swim();
    }

}
