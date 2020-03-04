package org.example;

import org.junit.Before;
import org.junit.Test;

public class AppTes {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void main() {

        String macroalgae = "Haptophyta";
        String magnoliophyta= "magnoliopsida";

        PlantType plantType= new PlantType();
        PlantType Seeweed= new Seeweed(macroalgae);
        PlantType Flowers= new Flowers(magnoliophyta);

        Seeweed.classification();
        Seeweed.habitat();

        Flowers.classification();
        Flowers.habitat();
    }
}