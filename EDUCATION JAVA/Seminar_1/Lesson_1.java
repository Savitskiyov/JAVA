//В консоли запросить имя пользователя. В зависимости от текущего времени,
// вывести приветствие вида "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59; "Добрый вечер, <Имя>!",
// если время от 18:00 до 22:59; "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

package Seminar_1;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Lesson_1 {
    public static void main(String[] args) {
        // Получение данных с терминала
        Scanner iScanner = new Scanner(System.in);
        //Считываем строки из консоли
        System.out.println("Введите свое имя: ");
        String name = iScanner.nextLine();

        int hour = LocalDateTime.now().getHour();
        String text = "";

        if ((hour >= 5) && (hour < 12)) text = "Доброе утро, ";
        else if ((hour >= 12) && (hour < 18)) text = "Доброе день, ";
        else if ((hour >= 18) && (hour < 23)) text = "Доброе вечер, ";
        else text = "Доброе ночи, ";

        System.out.printf("%s %s", text, name);

        iScanner.close();;



    }
}
