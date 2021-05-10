package OOP;

public class Genus {
    private String gen;
    //constructor
    public Genus(String gen){
        this.gen = gen;
    }
    //accessor
    public String getGenusName() {
        return gen;
    }

    // toString

    @Override
    public String toString() {
        return " Animal Genus: " + gen;
    }
}
