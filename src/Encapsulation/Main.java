package Encapsulation;

public class Main {
    public static void main(String[] args) {
        A obj = new A(3,"chandru");
        //need to do few things
        //1.access the data members
        //2.modify the data members
        obj.arr= new int[]{2, 2, 3};
        //System.out.println(obj.getNum());
         int n=obj.num;
        System.out.println(n);

    }
}
