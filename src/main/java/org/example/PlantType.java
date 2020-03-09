package org.example;

public class PlantType implements PlantInterface {


    @Override
    public void classification() {
        System.out.println("Plants are classified");
    }


    @Override
    public void habitat()
    {
        System.out.println("Where plants are grown");
    }
}
