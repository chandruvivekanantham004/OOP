package ExceptionHandling;

public class Exception {


    public Exception(String message) {
    }

        public static void main (String[]args){

            try {
                String name = "kunal";
                if (name.equals("kunal")) {       //1.11 oop7 ask question
                    new MyException("i am kunal");

                }


            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("this will always  execute");
            }
        }
//   static int divide(int a,int b) throws ArithmeticException{
//        if(b==0){
//            throw new ArithmeticException("don't set the number to 0");
//            //here you are explicitly mentioning it
//        }
//        return a/b;
    }

