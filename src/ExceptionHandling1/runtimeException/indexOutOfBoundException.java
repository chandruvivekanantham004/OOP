package ExceptionHandling1.runtimeException;

public class indexOutOfBoundException  {
    //there is 2 index of bound exceptions String and array;
    public static void main(String[] args) {
        indexOutOfBoundException i=new indexOutOfBoundException();
        i.method1();
    }
    public void method1()  {
        String s="jj";
        System.out.println(s.charAt(3));

    }
}
