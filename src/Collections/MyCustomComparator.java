package Collections;

import java.util.Comparator;

public class MyCustomComparator implements Comparator<StudentMarks> {
    @Override
    public int compare(StudentMarks o1, StudentMarks o2) {
        System.out.println("I am in compare method of comparator interface");
        return o2.getMathsmark()-o1.getMathsmark();
    }
}
