package Encapsulation;

public class A {
   protected int num;
    String name;
    int[] arr;

    public void setNum(int num) {
        this.num = num;//last line
    }

    public A(int num, String name){
    this.num=num;
    this.name=name;
    this.arr=new int[num];
}

    public int getNum() {
        return num;//if you want to access private members you could use getters and setters
        //see subclass to know how to access protected members
    }
}
