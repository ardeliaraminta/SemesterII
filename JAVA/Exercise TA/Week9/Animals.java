package Week9;
public class Animals{
    private int lifeSpan;
    private String habitat;

    public Animals(){
        this.lifeSpan = 60;
        this.habitat = "Sea";
    }

    public void eatFood(){
        System.out.println("Nyom Nyom Nyom");
    }

    //Overloading
    public void eatFood(String foodEaten) {
        System.out.println("Inedible, dead :(");
    }

    public static void swim(){
        System.out.println("Dive dive dive");
    }
}