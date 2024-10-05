class Student{
    int rno;
    float marks=90;
    public class objectorientedprogramming {
        public static void main(String[] args) {

            Student kunal = new Student(44,55f,"rahul");
            // kunal.changename("maxwell");
            //kunal.greeting();
            //kunal.marks= 67;;
            Student random = new Student(kunal);
            Student random2 = new Student();
            System.out.println(random2.name);
        }
    }

    String name;
    //we need a way to add the value of the above properties object by object
    //we need one word to access every object
    void greeting(){
        System.out.println("hello my name is "+this.name);
    }
    void changename(String newname){
        name= newname;
    }
    Student(int rno,float marks,String name){
        this.rno= rno;
        this.marks= marks;
        this.name= name;
    }
    Student(Student other){
        this.rno= other.rno;
        this.marks= other.marks;
        this.name= other.name;
    }

    Student(){
        this(0,0.0f,"default person");
        //this is how you can call a constructor from an another constructor
        //internally: new Student(0,0.0f,"default person")


    }
}
