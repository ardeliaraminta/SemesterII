package Week10;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Earth earth = new Earth();
        Earth earth2 = new Earth();

        int i = earth.layers;
        earth.globalWarming();
        earth.createTide();
        earth.cyclicOrbit();
        earth.orbitPlanet();
        earth.getLayers();

        ArrayList<Earth> earths = new ArrayList<>();
        earths.add(earth);
        earths.add(earth2);


    }
}
