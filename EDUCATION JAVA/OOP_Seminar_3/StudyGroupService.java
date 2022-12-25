package OOP_Seminar_3;


import java.util.Collections;

public class StudyGroupService {
    private StudyGroup studyGroup;
    private static int idStudent;

    public StudyGroupService(StudyGroup studyGroup) {
        this.studyGroup = studyGroup;
        idStudent = 0;
    }

    public void addStudent(String name){
        Student student = new Student(idStudent++, name);
        studyGroup.addStudent(student);
    }

    public void sortByName(){
        Collections.sort(studyGroup.getStudentList());
    }

    public void sortById(){
        Collections.sort(studyGroup.getStudentList(), new StudentComparatorById());
    }
}