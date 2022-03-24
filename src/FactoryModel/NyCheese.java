package FactoryModel;

public class NyCheese extends FactoryPizza{
    public void  prepare(){
        System.out.println("NY Cheese prepare");
    }

    public void  bake(){
        System.out.println("NY Cheese bake");
    }

    public void  cut(){
        System.out.println("NY Cheese cut");
    }

    public void  box(){
        System.out.println("NY Cheese box");
    }
}
