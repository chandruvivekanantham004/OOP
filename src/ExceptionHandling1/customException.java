package ExceptionHandling1;

public class customException extends ArithmeticException {
    public customException(String s){
        super(s);
    }

    public static void main(String[] args) {
        try{
            method();
        } catch (ArithmeticException e) {
            throw new customException("this is the exception created by me");
        }

    }
    public static void method() throws ArithmeticException{
        int a=9;
        int b=0;
        int c=a/b;
        System.out.println(c);
    }
}
