package Seminar_4;

import java.util.LinkedList;
import java.util.Scanner;

// Реализовать консольное приложение, которое
// 1. Принимает от пользователя строку вида
// text ~ num
// 2. Нужно рассплитить строку по ~, сохранить text в связный спиcок на позицию num
// 3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет ее из списка
public class Lesson_2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        String str;
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.printf("Введите строку вида text~num: ");
            String nString = iScanner.nextLine();
            if (nString.equals("")) {
                break;
            }
            String[] sArr = nString.split("~");
            if (!sArr[0].equals("print")) {
                System.out.println(sArr.length);
                ll.add(Integer.parseInt(sArr[1]), sArr[0]);
                System.out.println(ll);
            } else {
                str = ll.remove(Integer.parseInt(sArr[1]));
                System.out.printf("Элемент %s\n", str);
                System.out.printf("Оставшийся список %s\n", ll);
            }
        }
        iScanner.close();

    }
}
