package OOP_Seminar_5.DZ_1.Service.Tree;

import java.util.Comparator;

import OOP_Seminar_5.DZ_1.Entities.Human;

public class HumanComparatorChildCount implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return Integer.compare(o2.getChildrensNumber(), o1.getChildrensNumber());
    }
}