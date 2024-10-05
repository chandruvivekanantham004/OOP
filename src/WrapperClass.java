public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Integer num = 20;
        //primitives are not objects and its stored in the stack
        //"Integer" is used to create object in heap it is wrapper class

        //  swap(a,b);
        //  System.out.println(a+" "+b);
        //because of "final" we cannot swap it
        C chandru = new C("maxwell");
        System.out.println(chandru.name);
        chandru.name = "max";
        System.out.println(chandru.name);
        //when a non primitive is final you cannot reassign it you can only change the value of the object



        C MAX = new C("rabvbffg");
        System.out.println(MAX);
    }
    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
class C{
    final int a=10;
    String name;
    C(String name){
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}
