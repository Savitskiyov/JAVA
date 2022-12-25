package OOP_Seminar_3;

import java.util.Comparator;

public class StudentComparatorById implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}