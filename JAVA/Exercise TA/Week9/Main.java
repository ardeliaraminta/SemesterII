package Week9;

public class Main {
    public static void main(String[] args) {

        Animals t = new Animals();
        Animals s = new Shark();
        Animals g = new Animals();

        // both has the same sound of eating ( static)
        t.eatFood();
        s.eatFood();

        s.eatFood("plastic");
        g.eatFood("mustard");

        // by removing the word static for both turtle and shark has different sound  ( dynamic )
        t.swim();
        s.swim();
    }

}
