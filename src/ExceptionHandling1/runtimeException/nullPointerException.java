package ExceptionHandling1.runtimeException;

public class nullPointerException {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        String n=null;
        System.out.println(n.toUpperCase());

    }
}
