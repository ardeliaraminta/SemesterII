package finalExam;

public class MainAnimal {
    public static void main(String []args) {
        Lion lion1 = new Lion("Lulu", 10, 5);
        Snake snake1 = new Snake("Lola", 5, 100);
        Monkey monkey1 = new Monkey("Luna", 6, "Banana Waffle");

        System.out.println(lion1.toString());
        System.out.println(snake1.toString());
        System.out.println(monkey1.toString());
    }
}

