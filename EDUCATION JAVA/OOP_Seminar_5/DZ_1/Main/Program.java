package OOP_Seminar_5.DZ_1.Main;

import OOP_Seminar_5.DZ_1.Entities.FamilyTree;
import OOP_Seminar_5.DZ_1.Entities.Human;
import OOP_Seminar_5.DZ_1.Service.Tree.FTFirstFill;

public class Program {
    public static void main(String[] args) {
        FamilyTree<Human> familyTree = new FamilyTree<Human>();
        new FTFirstFill(familyTree);
        Controller<Human> control = new Controller<>(familyTree);

        while (control.getControllerStatus()) {
            control.startControl();
        }
    }

}