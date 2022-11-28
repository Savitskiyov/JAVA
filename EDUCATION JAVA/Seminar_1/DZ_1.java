package Seminar_1;
//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class DZ_1 {
    public static void main(String [] args) {
        // Получение данных с терминала
        Scanner iScanner = new Scanner(System.in);
        //Считываем строки из консоли
        System.out.println("Введите число n: ");
        String n = iScanner.nextLine();
        int intN = Integer.parseInt(n);
        int val = (intN * (intN + 1))/2;
        System.out.printf("Сумма чисел от 1 до %s = %s",n,val);
    }

}
