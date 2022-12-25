package OOP_Seminar_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudyGroup group = new StudyGroup();
        StudyGroupService studyGroupService = new StudyGroupService(group);

        studyGroupService.addStudent("Ваня");
        studyGroupService.addStudent("Петя");
        studyGroupService.addStudent("Вася");
        studyGroupService.addStudent("Маша");

//        List<String> list = new ArrayList<>();
//
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            String s = iterator.next();
//            System.out.println(s);
//        }


        for (Student student: group){
            System.out.println(student);
        }
        System.out.println();

        studyGroupService.sortByName();
        for (Student student: group){
            System.out.println(student);
        }

        System.out.println();

        studyGroupService.sortById();
        for (Student student: group){
            System.out.println(student);
        }
    }
}

