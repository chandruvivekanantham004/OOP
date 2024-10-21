package Encapsulation;

public class ObjectDemo {
    int num;
    float marks;
    public ObjectDemo(int num,float marks) {
        this.num = num;
        this.marks=marks;
    }

    @Override
    public int hashCode() {//unique representation of object via numbers
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "ObjectDemo{}";
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(3,44.44f);
        ObjectDemo obj2= new ObjectDemo(3,44.33f);
        if (obj == obj2){
            System.out.println("obj1 is equal to obj2");
        }
        if (obj.equals(obj2)) {
            System.out.println("we are equal");
        }else{
            System.out.println("not equal");
        }
    }
}
