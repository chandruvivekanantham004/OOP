package ExceptionHandling1.compileTimeException;

public class classNotFoundException {
    public static void main(String[] args)throws ClassNotFoundException {
        method();
    }
    public static void method() throws  ClassNotFoundException {
        throw new ClassNotFoundException();
    }
}
