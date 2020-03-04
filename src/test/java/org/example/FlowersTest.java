package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlowersTest {


    String magnoliophyta= "magnoliopsida";



    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void classification() {

        assertEquals("","Can be classified as"+magnoliophyta,"Can be classified as"+magnoliophyta);

    }

    @Test
    public void habitat() {

        assertEquals("","Flowers grow in a floriculture","Flowers grow in a floriculture");
    }


    @Test
    public void checkFlowersFail(){

        assertEquals("","Can  classified as"+magnoliophyta,"Can be classified as"+magnoliophyta);

    }




    @Test
    public  void  tearDown() throws Exception{


    }
}