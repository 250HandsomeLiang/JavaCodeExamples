package SimpleFactory;

public class Greek extends Pizza{
    public void  prepare(){
        System.out.println("Greek prepare");
    }

    public void  bake(){
        System.out.println("Greek bake");
    }

    public void  cut(){
        System.out.println("Greek cut");
    }

    public void  box(){
        System.out.println("Greek box");
    }
}
