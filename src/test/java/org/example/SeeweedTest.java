package org.example;

import org.junit.Before;
import org.junit.Test;

public class SeeweedTest {

   // private String macroalgae = "Haptophyta";

    private Seeweed sweed = new Seeweed();

    @Before
    public void setUp() throws Exception {
    }

@Test
public void  polymorphicTest(){

        sweed.habitat();


}

    @Test
    public  void  tearDown() throws Exception{


    }
}