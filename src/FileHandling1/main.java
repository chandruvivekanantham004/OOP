package FileHandling1;

import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader((System.in));
        System.out.println(" enter an number:");
        int n=isr.read();
        while(isr.ready()){
            System.out.println((char)(n));
            n= isr.read();
        }
        isr.close();
    }
}
