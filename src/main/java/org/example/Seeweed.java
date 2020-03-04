package org.example;

public class Seeweed extends PlantType {

    private  String  macroalgae;

    public Seeweed() {
    }

    public Seeweed(String macroalgae) {
        this.macroalgae = macroalgae;
    }


    public void setMacroalgae(String macroalgae) {
        this.macroalgae = macroalgae;
    }

    public String getMacroalgae() {
        return macroalgae;
    }


    @Override
    public void classification() {
        System.out.println("A seeweed is classified as a :"+macroalgae);
    }

    @Override
    public void habitat() {
        System.out.println("A seeweed grows in water bodies");
    }
}// class
