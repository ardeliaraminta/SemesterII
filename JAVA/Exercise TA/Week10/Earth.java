package Week10;

public class Earth extends Planet implements Satellites, Atmosphere{
    private String scientificName;
    public int layers;

    public Earth(){}

    public Earth(String scientificName, int layers) {
        this.scientificName = scientificName;
        this.layers = layers;

    }


    @Override
    public void setLayer() {
        this.layers = layers;
    }

    @Override
    public int getLayers() {
        return layers;
    }

    @Override
    public void cyclicOrbit() {
        System.out.println(" wew wew wew ");

    }

    @Override
    public void globalWarming() {
        System.out.println("Earth says: why am i so hot");

    }


    @Override
    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    @Override
    public String getScientificName() {
        return scientificName ;
    }

    @Override
    public void createTide() {
        System.out.println("Earth says: create tide!");

    }

    @Override
    public void orbitPlanet() {
        System.out.println("Moon: Orbit planet ninuninuninu");

    }
    public String toString() {
        return "Type of Earths: {" +
                "Name: " + getScientificName()+
                ",Layers: " + getLayers();
    }
}
