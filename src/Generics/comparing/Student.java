package Generics.comparing;

public class Student implements Comparable<Student> {
    String name;
    int rollno;
    float marks;

    public Student(String name, int rollno, float marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;

    }



    @Override
    public int compareTo(Student o) {
        int difference =(int) (this.marks - o.marks);
        return difference;
    }


    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                '}';
    }
}
