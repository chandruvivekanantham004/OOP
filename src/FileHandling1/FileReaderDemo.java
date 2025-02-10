package FileHandling1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("/home/rocky/Downloads/java.txt");
       // System.out.println(file.exists());
        FileReader Freader=new FileReader(file);
        int s=Freader.read();
        while(Freader.ready()){
            System.out.println((char)(s));
            s=Freader.read();
        }
        Freader.close();


    }
}
