package ExceptionHandling1.compileTimeException;
//there were other 2 exception as well IOexception,and SQLexception;
public class classNotFoundExceptionUsingTryCatch {
    public static void main(String[] args) {
        try{
            method1();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }//if you didn't want to execute the finally block you can
        //use the System.exit(0); in the previous line;
        finally {
            System.out.println("hi all i'm in finally block");
        }
    }
    public static void method1() throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }
}
