package FactoryModel;

public class CHGreek extends FactoryPizza {
    public void  prepare(){
        System.out.println("CH Greek prepare");
    }

    public void  bake(){
        System.out.println("CH Greek bake");
    }

    public void  cut(){
        System.out.println("CH Greek cut");
    }

    public void  box(){
        System.out.println("CH Greek box");
    }
}
