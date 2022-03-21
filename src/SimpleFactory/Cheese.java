package SimpleFactory;

public class Cheese extends Pizza{
    public void  prepare(){
        System.out.println("Cheese prepare");
    }

    public void  bake(){
        System.out.println("Cheese bake");
    }

    public void  cut(){
        System.out.println("Cheese cut");
    }

    public void  box(){
        System.out.println("Cheese box");
    }
}
