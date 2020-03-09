package org.example;

import org.junit.Before;
import org.junit.Test;

public class FlowersTest {


private  Flowers fl = new Flowers();


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void classification() {
        System.out.println(fl.getMagnoliophyta());
        fl.classification();

    }




    @Test
    public  void  tearDown() throws Exception{


    }
}