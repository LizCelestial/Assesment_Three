package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TreeTest {

  private Tree tree= new Tree();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void nameTesting(){


        Assert.assertEquals("decidueous",tree.getPerennial());




    }



}