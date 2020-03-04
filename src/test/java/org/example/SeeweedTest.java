package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SeeweedTest {

    private String macroalgae = "Haptophyta";
    private String magnoliophyta= "magnoliopsida";

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void classification() {

        assertEquals(""," seeweed is classified as a :"+macroalgae, " seeweed is classified as a :"+macroalgae);
    }

    @Test
    public void habitat() {

     assertEquals("","A seeweed grows in water bodies","A seeweed grows in water bodies");
//
    }

    @Test
    public  void  tearDown() throws Exception{


    }
}