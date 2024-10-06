public class Static {

    static int a = 3;
    static int b;

    static{
        System.out.println("static block is executed");

        b=a*3;
    }

    public static void main(String[] args) {
        Static obj = new Static();
        System.out.println(Static.a + " "+Static.b);
        Static.b+=3;
        System.out.println(Static.a + " "+Static.b);
    }
}
