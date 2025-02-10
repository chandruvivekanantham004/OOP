package Serialization;

import java.io.*;

public class serializationDemo {
    public static void main(String[] args) throws IOException,ClassNotFoundException {

        //this is serialization
        Employee emp=new Employee();
        emp.setId(1);
        emp.setName("first name");
        FileOutputStream file =new FileOutputStream("/home/rocky/Downloads/serialization");
        ObjectOutputStream obj=new ObjectOutputStream(file);
        obj.writeObject(emp);
        obj.close();
        file.close();

        //we are going to deserialize the above
        FileInputStream file1=new FileInputStream("/home/rocky/Downloads/serialization");
        ObjectInputStream ob1=new ObjectInputStream(file1);
        Employee employee=(Employee)(ob1.readObject());
        System.out.println(employee.getName());
        ob1.close();
        file1.close();



    }
}
