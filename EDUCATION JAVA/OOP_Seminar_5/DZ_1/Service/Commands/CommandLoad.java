package OOP_Seminar_5.DZ_1.Service.Commands;

import OOP_Seminar_5.DZ_1.Entities.Human;
import OOP_Seminar_5.DZ_1.Main.FTService;
import OOP_Seminar_5.DZ_1.Main.UserCommunication;

public class CommandLoad<T extends Human> implements Executable {
    private FTService<T> fts;
    private UserCommunication<T> uc;

    public CommandLoad(FTService<T> fts, UserCommunication<T> uc) {
        this.fts = fts;
        this.uc = uc;
    }

    @Override
    public void execute() {
        fts.createBackup();
        fts.clearTree();
        try {
            fts.load();
            uc.loadAction(true);
        } catch (Exception e) {
            e.printStackTrace();
            uc.loadAction(false);
            fts.restoreFromBackup();
        }
    }

    @Override
    public String description() {
        return "Загрузить дерево из файла";
    }

}
