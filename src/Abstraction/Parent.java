package Abstraction;

public abstract class Parent {
    int age;

    @Override
    public String toString() {//EXAMPLE you do not in notes :)
        return "Parent{" +
                "age=" + age +
                ", VALUE=" + VALUE +
                '}';
    }

    final int VALUE;
    public Parent(int age) {
        this.age = age;
        VALUE=12;
    }

    //abstract Parent(); //you can't able to create abstract constructor
    // also abstract static methods are not allowed because static does not depend on obj;overriding depend on obj
   //static methods in abstract classes is allowed
    static void hello(){
        System.out.println("hey");
    }
    abstract void career();
    abstract void aim();
}
