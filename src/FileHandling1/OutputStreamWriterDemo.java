package FileHandling1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class OutputStreamWriterDemo {
    public static void main(String[] args) {
       try{ OutputStreamWriter os=new OutputStreamWriter(System.out);
        os.write(44);
        os.write("hello all");
        char[] d="hello world".toCharArray();
        os.write(d);//you can not able to print the emoji because writer is of character
        os.close();

       } catch (IOException e) {
           System.out.println(e.getMessage());
       }

    }
}
