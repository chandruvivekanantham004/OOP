package Abstraction;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to be an aws engineer");
    }

    @Override
    void aim() {
        System.out.println("I love aws console");
    }
}
