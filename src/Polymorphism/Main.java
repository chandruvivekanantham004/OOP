package Polymorphism;
//run time/dynamic polymorphism;
public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Square square = new Square();
        Shapes circle = new Circle();
        Triangle triangle = new Triangle();
        shape.area();
        circle.area();//it will return the circle area because of overriding the parent class
    }
}
