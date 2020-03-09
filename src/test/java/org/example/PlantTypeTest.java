package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlantTypeTest {



    String macroalgae = "Haptophyta";
    String magnoliophyta= "magnoliopsida";

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void classification() {


        PlantType plantType= new PlantType();
        PlantType Seeweed= new Seeweed(macroalgae);
        PlantType Flowers= new Flowers(magnoliophyta);

        Seeweed.classification();
        Seeweed.habitat();

        Flowers.classification();
        Flowers.habitat();

        Assert.assertEquals(Seeweed.getClass(),Seeweed.getClass());

    }






    @Test
    public  void  tearDown() throws Exception{

    }
}