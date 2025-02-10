package ExceptionHandling1.runtimeException;

public class arithmeticException {
    public static void main(String[] args) {
        method1();
    }
    //strackTrace is nothing but where like  the path of exception is from starting
    public static void method1(){
        method2();
    }
    public static void method2(){
        int a=6;
        int b=0;
        System.out.println(a/b);
    }
}
