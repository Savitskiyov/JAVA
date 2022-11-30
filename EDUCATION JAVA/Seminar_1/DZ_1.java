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


//1. Вычислить сумму чисел от 1 до n и n! (произведение чисел от 1 до n) 2 вариант


//public class DZ_1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите n:");
//        int n= scanner.nextInt();
//        System.out.printf("Сумма от 1 до n равна %s\n", countNTriangle(n));
//        System.out.printf("Произведение от 1 до n равно %s", factorial(n));
//        scanner.close();
//    }
//
//    public static int countNTriangle(int n) {
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//
//        }
//        return sum;
//    }
//    public static int factorial(int n) {
//        int f = 1;
//        for (int i = 1; i <= n; i++) {
//            f *= i;
//
//        }
//        return f;
//    }
//}
