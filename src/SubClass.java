import Encapsulation.A;


public class SubClass  extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(5, "hi");
        int n = obj.num;
        // System.out.println();
    }
    public class SubSubclass extends SubClass{

        public SubSubclass( int num, String name){
                super(num, name);
        }
            SubSubclass a = new SubSubclass(3, "subsubclass");
            int h = a.num;
    }

    class Subclass2 extends A {

        public Subclass2(int num, String name) {
            super(num, name);
        }
//            A obj = new Subclass2(3, "IamA");
//            int m = obj.num;    //ERROR becausse the parent class does not know what classes are below

    }
}

