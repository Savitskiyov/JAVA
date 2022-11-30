package Seminar_1;

//Вариант 2 (универсальный)


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;


public class DZ_4_2 {
    public static void main(String[] args) {
        // Читаем выражение из файла input.txt
        String inputString = getDataFromFile("C:\\Users\\ovash\\Downloads\\JAVA\\Seminar1\\input.txt");
        System.out.println("Выражение: " + inputString);
        // Вывод результата
        getSolution(inputString);
    }


    public static void getSolution(String str) {
        // Подсчитываем количество знаков ?
        int countSep = countChars(str, '?');
        System.out.println("Неизвестных: " + String.valueOf(countSep));
        // Вариантов подстановок цифр будет 10 в степени количества неизвестных
        for (int i = 0; i < Math.pow(10, countSep); i++){
            // Пробежимся в цикле по всем возможным вариантам
            // Сформируем строку подстановки, которую будем использовать для подстановки цифр
            // Дополним строку нулями
            // Например, если неизвестных 5: 00000, 00001, 00005
            String replacementString = String.format("%0"+String.valueOf(countSep) +"d", i);
            // Скопируем строку выражения
            String newstr = str;
            // Подставим на места знаков ? соответсвующую цифру из строки подстановки
            for (int j = 0; j < countSep; j++){
                // Первый ? заменяется на первую цифру из строки подстановки, второй на вторую и т.д.
                newstr = newstr.replaceFirst(String.valueOf("\\?"), String.valueOf(replacementString.charAt(j)));
            }
            check(newstr);
        }

    }

    // Проверка
    public static void check(String str) {
        // Формируем список. Разделитель - пробел, "+" и "=" исключаем
        ArrayList<String> list = new ArrayList<>(List.of(str.split(" ")));
        list.remove("+");
        list.remove("=");
        // Присвоим переменным
        int x = Integer.parseInt(list.get(0));
        int y = Integer.parseInt(list.get(1));
        int z = Integer.parseInt(list.get(2));
        // Проверим, получилось ли верное равенство
        if (x + y == z ){
            System.out.println(str);
        }
    }

    // Вспомогательная функция для подсчета количества ? в строке
    public static int countChars(String Input, char SomeChar ) {
        int count = 0;
        for (int i = 0; i < Input.length(); i++) {
            if (Input.charAt(i) == SomeChar) {
                count++;
            }
        }
        return count;
    }
    // Чтение из файла
    public static String getDataFromFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
            return "";
        }
    }
}
