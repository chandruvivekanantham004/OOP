package Abstraction;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to be an doctor");
    }

    @Override
    void aim() {
        System.out.println("I like to help people's");
    }
}
