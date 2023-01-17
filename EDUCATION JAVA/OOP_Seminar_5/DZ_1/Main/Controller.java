package OOP_Seminar_5.DZ_1.Main;

import java.util.ArrayList;
import java.util.List;

import OOP_Seminar_5.DZ_1.Service.Commands.*;
import OOP_Seminar_5.DZ_1.Entities.FamilyTree;
import OOP_Seminar_5.DZ_1.Entities.Human;


public class Controller<T extends Human> {

    private boolean controllerOn = true;
    private FTService<T> fts;
    private UserCommunication<T> uc;
    private List<Executable> commandList;

    public Controller(FamilyTree<T> familyTree) {
        this.fts = new FTService<T>(familyTree);
        this.uc = new UserCommunication<T>();
        commandList = new ArrayList<>();

        commandList.add(new CommandShowHumans<>(fts, uc));
        commandList.add(new CommandSearch<>(fts, uc));
        commandList.add(new CommandAdd<>(fts, uc));
        commandList.add(new CommandSave<>(fts, uc));
        commandList.add(new CommandLoad<>(fts, uc));
        commandList.add(new CommandSortName<>(fts, uc));
        commandList.add(new CommandSortByChildren<>(fts, uc));
    }

    /**
     * Проверка статуса контроллера, для выбора дальнейшего действия: продолжения
     * или завершения работы
     *
     * @return boolean статус контроллера о продолжении работы
     */
    public boolean getControllerStatus() {
        return controllerOn;
    }

    /**
     * Запуск работы контроллера
     */
    public void startControl() {
        String userInput = uc.launchMenu(commandList);

        if (userInput.equals("q")) {
            this.controllerOn = false;
            uc.closeInput();
        } else {
            try {
                int choosenMenuPoint = Integer.parseInt(userInput);
                commandList.get(choosenMenuPoint).execute();
            } catch (NumberFormatException e) {
                uc.printIncorrectInput();
            } catch (IndexOutOfBoundsException e) {
                uc.printIncorrectInput();
            }
        }
    }
}