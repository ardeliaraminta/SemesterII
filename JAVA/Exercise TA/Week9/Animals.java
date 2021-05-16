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

    public static void swim(){
        System.out.println("Dive dive dive");
    }
}