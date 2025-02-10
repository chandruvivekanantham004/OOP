package Generics;

public class Printer <T>{
   T n;

    public Printer(T n) {
        this.n = n;
    }
    public void print(){
        System.out.println(n);
    }
}
