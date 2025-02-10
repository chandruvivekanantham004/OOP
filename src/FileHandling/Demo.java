package FileHandling;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        String str="/home/rocky/Downloads/java.txt";
        File file=new File(str);
//        System.out.println(file.exists());//file exist or not
//        System.out.println(file.canWrite());//file is able to write or not
//        System.out.println(file.canRead());//file is able to read or not
//        System.out.println(file.getName());
//        System.out.println(file.getParent());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.isFile());//is this file
//        System.out.println(file.isDirectory());//is this directory
//        System.out.println(file.mkdir());//to make a directory
        String[] files=file.list();
        for(String m:files){
            System.out.println(m);
        }//this is how you can list the file and print it;
        file.delete();//used to delete files




    }
}
