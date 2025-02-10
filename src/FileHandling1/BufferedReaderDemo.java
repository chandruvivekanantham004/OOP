package FileHandling1;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
      BufferedReader br=new BufferedReader((new InputStreamReader(System.in)));
      //internally byte to char and then reading the char Streams using InuputStreamReader
        System.out.println("enter the words which you needs to print:");
        System.out.println(br.readLine());
    }
}