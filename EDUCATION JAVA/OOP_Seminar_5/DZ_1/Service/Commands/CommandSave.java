package OOP_Seminar_5.DZ_1.Service.Commands;

import java.io.IOException;

import OOP_Seminar_5.DZ_1.Entities.Human;
import OOP_Seminar_5.DZ_1.Main.FTService;
import OOP_Seminar_5.DZ_1.Main.UserCommunication;

public class CommandSave<T extends Human> extends Command<T> {
    public CommandSave(FTService<T> fts, UserCommunication<T> uc) {
        super(fts, uc);
    }

    @Override
    public void execute() {
        try {
            fts.save();
            uc.saveAction(true);
        } catch (IOException e) {
            e.printStackTrace();
            uc.loadAction(false);
        }
    }

    @Override
    public String description() {
        return "Сохранить текущее дерево в файл";
    }

}