package Generics.comparing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student("kunal",44,85);
        Student rahul = new Student("rahul kannan",47,75);
        Student max = new Student("maxtoby",4,95.5f);
        Student[] list={kunal,rahul,max};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.marks-o2.marks);
            }
        });
        System.out.println(Arrays.toString(list));


//        if(kunal.compareTo(max)<0){
//            System.out.println(kunal.compareTo(max));
//            System.out.println("max has long name");
//        }else{
//            System.out.println("kunal has long name");
        }
    }

