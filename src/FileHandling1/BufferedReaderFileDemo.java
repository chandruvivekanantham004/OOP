package FileHandling1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderFileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/rocky/Downloads/java.txt");
        BufferedReader br=new BufferedReader(new FileReader(file));
        while(br.ready()){
            System.out.println(br.readLine());
        }
    }
}
