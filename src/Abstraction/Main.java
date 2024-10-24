package Abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(22);
        Daughter daughter = new Daughter(19);
        son.aim();
        son.career();
        daughter.aim();
        daughter.career();
      //  Parent obj = new Parent(); //YOU can't able to create objects of an abstract class
//        int n =son.VALUE;
//        System.out.println(n);
        System.out.println(son);
    }
}