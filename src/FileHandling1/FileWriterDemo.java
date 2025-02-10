package FileHandling1;

import java.io.*;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("/home/rocky/Downloads/java.txt");
        FileWriter writer=new FileWriter(file);
        writer.write("do you know anything");
        writer.write("i am actually writng an file");
        writer.close();
//        FileReader reader=new FileReader(file);
//        int c= reader.read();
//        while(reader.ready()){
//            System.out.println((char)(c));
//            c= reader.read();
//        }
        BufferedReader br=new BufferedReader(new FileReader(file));
        while(br.ready()){
            System.out.println(br.readLine());
        }
    }
}
