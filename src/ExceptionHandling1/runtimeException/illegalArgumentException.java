package ExceptionHandling1.runtimeException;

public class illegalArgumentException {
    //this is number format exception
    public static void main(String[] args) {
        int s=Integer.parseInt("54");//String to int;
        int m=Integer.parseInt("abc");
        System.out.println(m);
    }
}
