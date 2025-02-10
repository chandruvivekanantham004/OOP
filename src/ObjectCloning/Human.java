package ObjectCloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;
    public Human(int age,String name){
        this.age=age;
        this.name=name;
        this.arr=new int[]{3,4,2,1,10};
    }
//    public Human(Human obj){
//        this.age=obj.age;
//        this.name=obj.name;
//    }
//    public Object clone() throws CloneNotSupportedException{
//        return super.clone();//shallow copy the reference variable pointing the same object it just won't make any copy
//    }
    //to avoid this we have to use deep copy create an copy of the references
    public Object clone() throws CloneNotSupportedException{
        Human H4=(Human)super.clone();
        H4.arr=new int[H4.arr.length];
        for(int i=0;i<H4.arr.length;i++){
           H4.arr[i]=this.arr[i];
        }
        return H4;//deep copy example;
    }
}
