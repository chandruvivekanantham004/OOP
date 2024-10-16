package Polymorphism;

public class ObjPrint {//every method extends object class;
    int num;

    @Override//because of toString method its Overriden
    public String toString() {
        return "ObjPrint{" +
                "num=" + num +
                '}';
    }

    public ObjPrint(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        ObjPrint obj = new ObjPrint(44);
        System.out.println(obj);//internally it calls the toString method
    }
}
