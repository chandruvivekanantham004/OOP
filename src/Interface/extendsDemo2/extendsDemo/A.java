package Interface.extendsDemo2.extendsDemo;

public interface A {
    //static interface methods will always hava a body

    static void greet(){
        System.out.println("hey i am static");
    }
   default void fun(){
       System.out.println("this is default one");//if you have multiple names don't
                      //it's an additional feature
   }
}
