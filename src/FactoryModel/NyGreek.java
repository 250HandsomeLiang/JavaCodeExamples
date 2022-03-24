package FactoryModel;

public class NyGreek extends FactoryPizza {
    public void  prepare(){
        System.out.println("NY Greek prepare");
    }

    public void  bake(){
        System.out.println("NY Greek bake");
    }

    public void  cut(){
        System.out.println("NY Greek cut");
    }

    public void  box(){
        System.out.println("NY Greek box");
    }

}
