package OOP_Seminar_5.DZ_1.Service.Commands;

import java.util.Map;

import OOP_Seminar_5.DZ_1.Entities.Human;
import OOP_Seminar_5.DZ_1.Main.FTService;
import OOP_Seminar_5.DZ_1.Main.UserCommunication;

public class CommandSearch<T extends Human> extends Command<T> {
    public CommandSearch(FTService<T> fts, UserCommunication<T> uc) {
        super(fts, uc);
    }

    @Override
    public void execute() {
        Map.Entry<Integer, T> personWithId = fts.searchByName(uc.askFullName());
        uc.showMoreHumansInfo(personWithId);
    }

    @Override
    public String description() {
        return "Найти человека по имени и фамилии";
    }

}