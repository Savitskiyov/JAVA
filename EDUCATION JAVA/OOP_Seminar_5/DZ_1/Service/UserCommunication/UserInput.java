package OOP_Seminar_5.DZ_1.Service.UserCommunication;

import java.util.Scanner;

public class UserInput {
    private Scanner input = new Scanner(System.in);

    public int getInt() {
        return input.nextInt();
    }

    public String getString() {
        return input.next();
    }

    public void closeInput() {
        input.close();
    }
}