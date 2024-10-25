package Interface;

public class Car implements Engine,Brake{
    @Override
    public void brake() {
        System.out.println("I break like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like ferrari");

    }

    @Override
    public void acc() {
        System.out.println("I accelerate like sports car");

    }
}
