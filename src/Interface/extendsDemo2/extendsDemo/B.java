package Interface.extendsDemo2.extendsDemo;

public interface B {
    void hello();
   // void fun();
     default void fun(){
         System.out.println("hiii");
     }


}
