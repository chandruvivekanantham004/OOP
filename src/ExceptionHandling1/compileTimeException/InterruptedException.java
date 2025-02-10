package ExceptionHandling1.compileTimeException;

public class InterruptedException {
    public static void main(String[] args) throws java.lang.InterruptedException {
        method();
    }
    public static void method() throws java.lang.InterruptedException {
        throw new java.lang.InterruptedException();
    }
}
