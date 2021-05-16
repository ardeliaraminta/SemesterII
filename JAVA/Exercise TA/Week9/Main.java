package Week9;

public class Main {
    public static void main(String[] args) {
        //For the first number, either remove the keyword static from the method of sleep, or change the declaration class to Dog

        Animals turtle = new Animals();
        Animals shark = new Reptile();

        //dynamic
        turtle.eatFood();
        shark.eatFood();

        //static
        turtle.swim();
        shark.swim();
    }

}
