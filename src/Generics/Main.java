package Generics;

public class Main {
    public static void main(String[] args) {
        IntegerPrinter printer = new IntegerPrinter(33);
        printer.print();
        //what if you need to create an obj in string do you again change the type
        //here it comes the generics
        Printer<String> list = new Printer("eieieiei");
        list.print();

    }
}
