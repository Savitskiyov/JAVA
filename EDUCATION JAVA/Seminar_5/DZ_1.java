package Seminar_5;

import java.util.*;

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов
public class DZ_1 {
    public static void main(String[] args) {
        Map<Integer, ArrayList<String>> phoneBook = new HashMap<Integer, ArrayList<String>>();
        Map<Integer, String> nameBook = new HashMap<Integer, String>();
        nameBook.put(0, "Иванов А.А.");
        nameBook.put(1, "Петров А.А.");
        nameBook.put(2, "Иванов А.А.");
        nameBook.put(3, "Сидоров А.А.");
        for (int i = 0; i < nameBook.size(); i++) {
            if (phoneBook.get(i) == null) {
                phoneBook.put(i, new ArrayList<String>());
                phoneBook.get(i).add("8-926-111-11-" + i + i + ";" + "8-926-222-22-" + i + i);
            }
            System.out.println("Телефонные номера абонента" + " " + nameBook.get(i) + " :" + phoneBook.get(i));
        }

    }
}
