package Polymorphism;

public class Circle extends Shapes{
    @Override//if it's not override it should give us error //this is known as annotation
    void area(){
        System.out.println("Area is pie*r*r");
    }
}
