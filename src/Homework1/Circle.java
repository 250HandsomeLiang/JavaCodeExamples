package Homework1;

public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double getPerimeter(){
        return (double) (Math.PI*radius*2);
    }
    public double getSquare(){
        return (double) (Math.PI*radius*radius);
    }
}
