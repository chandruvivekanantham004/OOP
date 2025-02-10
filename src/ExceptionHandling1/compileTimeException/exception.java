package ExceptionHandling1.compileTimeException;
import java.lang.*;
import java.lang.InterruptedException;
import java.util.*;


public class exception {
    public static void main(String[] args) throws ClassNotFoundException,InterruptedException{
        method("abc");
    }
    public static void method(String s)throws ClassNotFoundException,InterruptedException{
        if(s.equalsIgnoreCase("abc")){
            throw new ClassNotFoundException();
        }else{
            throw new InterruptedException();
        }
    }
}
