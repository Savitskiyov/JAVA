package Seminar_5;
// Написать программу, определяющую правильность расстановки скобок в выражении
import java.util.*;

public class Seminar_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите выражение ");
        String str = iScanner.nextLine();
        iScanner.close();
        str = "a+(d*3)";
        String[] ch = str.split("");
        System.out.println(Arrays.toString(ch));

        Map<String, Integer> db = new HashMap<>();
        db.put("(", 0);
        db.put(")", 0);

        int count = 0;
        for (String sym : ch) {
            if(sym.equals("(")) {
                count = db.get("(");
                db.put("(", ++count);
            } else if (sym.equals(")")) {
                count = db.get(")");
                db.put(")", ++count);
            }
            }
        if (db.get("(")==db.get(")")) {
            System.out.println("True");
        }



    }
}
