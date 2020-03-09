package org.example;

public class Flowers extends PlantType implements PlantInterface{
    private  String magnoliophyta="magnoliopsida";

    public Flowers() {
    }

    public Flowers(String magnoliophyta)
    {
        this.magnoliophyta = magnoliophyta;
    }

    public void setMagnoliophyta(String magnoliophyta)
    {
        this.magnoliophyta = magnoliophyta;
    }

    public String getMagnoliophyta()
    {
        return magnoliophyta;
    }

    @Override
    public void classification() {
      //  super.classification();
        System.out.println("Flower Classified as"+magnoliophyta);
    }

    @Override
    public void habitat() {
        super.habitat();
        //System.out.println("Flowers grow in a floriculture");
    }
}
