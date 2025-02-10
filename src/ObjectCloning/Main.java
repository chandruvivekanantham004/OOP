package ObjectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human H1 = new Human(33, "kunal");
      //  Human H2 = new Human(H1);
        //System.out.println(H2.age);
        Human h3=(Human) H1.clone();
        System.out.println(h3.age);
        h3.arr[0]=333;
        System.out.println(Arrays.toString(H1.arr));
        Human H5=(Human) (H1.clone());
        H5.arr[0]=44444;
        System.out.println(Arrays.toString(H1.arr));
    }
}
