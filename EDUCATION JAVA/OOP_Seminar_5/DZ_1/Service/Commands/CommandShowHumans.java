package OOP_Seminar_5.DZ_1.Service.Commands;

import OOP_Seminar_5.DZ_1.Entities.Human;
import OOP_Seminar_5.DZ_1.Main.FTService;
import OOP_Seminar_5.DZ_1.Main.UserCommunication;

public class CommandShowHumans<T extends Human> extends Command<T> {
    public CommandShowHumans(FTService<T> fts, UserCommunication<T> uc) {
        super(fts, uc);
    }

    @Override
    public String description() {
        return "Показать всех людей";
    }

    @Override
    public void execute() {
        uc.showHumansFromTree(fts.getAllHumans());
    }

}
