package Seminar_5;
// Создать структуру для хранения номеров паспорта и Фамилий сотрудников организаций
// Вывести данные по сотрудника с фамилией иванов
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Seminar_1 {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(111, "Иванов");
        db.putIfAbsent(222, "Петров");
        db.putIfAbsent(333, "Иванов");

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Кого ищем ? ");
        String str = iScanner.nextLine();
        iScanner.close();

        for (Integer numPass : db.keySet()) {
            if (Objects.equals(db.get(numPass).toLowerCase(), str.toLowerCase())){
                System.out.printf("Паспорт %d0 фамилия %s\n", numPass, db.get(numPass));
            }
        }

    }
}