package OOP_Seminar_3;

import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator implements Iterator<Student> {
    private List<Student> studentList;
    private int index;

    public StudyGroupIterator(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return index < studentList.size();
    }

    @Override
    public Student next() {
        return studentList.get(index++);
    }
}