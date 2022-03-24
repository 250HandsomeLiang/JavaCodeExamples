package FactoryModel;

public class CHCheese extends FactoryPizza{
    public void  prepare(){
        System.out.println("CH Cheese prepare");
    }

    public void  bake(){
        System.out.println("CH Cheese bake");
    }

    public void  cut(){
        System.out.println("CH Cheese cut");
    }

    public void  box(){
        System.out.println("CH Cheese box");
    }
}
