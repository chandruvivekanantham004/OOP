package Inheritance;

public class Main {
    public static void main(String[] args) {
        //Box.greeting();
        Box box = new Boxweight();
        Box.greeting();
        //Box box = new Box();
//       Box box1=new Box(box);
        // System.out.println(box.l+" "+box.w+" "+box.h);
//       System.out.println(box1.l+" "+box1.w+" "+box1.h);
//        Boxweight box2=new Boxweight();
//        System.out.println(box2.weight+" "+box2.w);
        // Box box3 = new Boxweight(6,8,4,3);
        //  System.out.println(box3.weight);//gives error because of the ref type
        //the type of ref variable not the object which determines what the members can be accessed
        //* there are many variables in both parent and child classes
        //you are given access to variables that are in the ref type i.e. Boxweight
        //hence, you should have access to weight variable
        //this also means that the one you are trying to access should be initialised
        //but,here when the obj is of the parent class then how will you call the constructor of child class
        //so,it's going to give us error
        // Boxweight box4=new Box(3,3,3);  //error
//        BoxPrice obj = new BoxPrice();
//        System.out.println(obj.h);
//        Boxweight obj1 = new BoxPrice(4, 4, 4, 4, 222);
//        System.out.println(obj1.weight);
//        BoxPrice obj2 = new BoxPrice(3,4,345);
//        System.out.println(obj2.l);
    }
}
