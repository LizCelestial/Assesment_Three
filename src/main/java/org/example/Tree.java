package org.example;

public class Tree {

    private  String perennial;

    public Tree() { }

    public Tree(String perennial) {
        this.perennial = perennial;
    }

    public void setPerennial(String perennial) {
        this.perennial = perennial;
    }

    public String getPerennial() {
        return perennial;
    }


    public static void main(String[] args) {

        Tree tree= new Tree();
        tree.setPerennial("decidueous");
        System.out.println("category:  "+tree.getPerennial());

    }


}
