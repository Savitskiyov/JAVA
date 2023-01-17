package OOP_Seminar_5.DZ_1.Service.Commands;

import OOP_Seminar_5.DZ_1.Entities.Human;
import OOP_Seminar_5.DZ_1.Main.FTService;
import OOP_Seminar_5.DZ_1.Main.UserCommunication;

public abstract class Command<T extends Human> implements Executable {
    protected FTService<T> fts;
    protected UserCommunication<T> uc;

    public Command(FTService<T> fts, UserCommunication<T> uc) {
        this.fts = fts;
        this.uc = uc;
    }

}