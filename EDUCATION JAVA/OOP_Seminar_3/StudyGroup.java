package OOP_Seminar_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student>{
    private List<Student> studentList;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudyGroupIterator(studentList);
    }
}