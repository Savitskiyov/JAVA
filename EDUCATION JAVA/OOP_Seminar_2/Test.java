package OOP_Seminar_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        sort(list);

        List list1 = new LinkedList();
        sort(list1);
    }

    public static void sort(List list){
        Collections.sort(list);
    }
}