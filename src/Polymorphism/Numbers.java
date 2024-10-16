package Polymorphism;
//compile time/static polymorphism which is achieved by method overloading
public class Numbers {
     void sum(double a,int b){
         System.out.println(a+b);
    }
    int sum(int a,int b,int c){
        return a+b+c;

    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println( obj.sum(4,4,6));//it will know which one to call when compile time
        obj.sum(8.99,6);
    }
}
