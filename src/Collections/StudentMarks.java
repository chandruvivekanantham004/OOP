package Collections;

import java.util.Objects;

public class StudentMarks implements Comparable<StudentMarks>{
   private int physicsmark;
    private int mathsmark;

    public StudentMarks(int a, int b) {
        this.mathsmark=a;
        this.physicsmark=b;
    }

    public int getPhysicsmark() {
        return physicsmark;
    }


    public int getMathsmark() {
        return mathsmark;
    }

    public void setPhysicsmark(int physicsmark) {
        this.physicsmark = physicsmark;
    }

    public void setMathsmark(int mathsmark) {
        this.mathsmark = mathsmark;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "physicsmark=" + physicsmark +
                ", mathsmark=" + mathsmark +
                '}';
    }

    @Override
    public int compareTo(StudentMarks o) {

    /*
    there are like three conditons in compare to
    those are
    current object < other object
    return -1;
    current object > other object
    return 1;
    currrent object == other object
    return 0;

     */
//        @@@ this three condition should be replaced by the below line
//        if(this.physicsmark<o.physicsmark) {
//            return -1;
//        }
//        if(this.physicsmark>o.physicsmark){
//            return 1;
//        }
//        if(this.physicsmark==o.physicsmark){
//            return 0;
//        }
        System.out.println("I am in compareTo method of combarable interface");
        return -(this.physicsmark-o.physicsmark);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentMarks that = (StudentMarks) o;
        return physicsmark == that.physicsmark && mathsmark == that.mathsmark;
    }

    @Override
    public int hashCode() {
        return Objects.hash(physicsmark, mathsmark);
    }
}
