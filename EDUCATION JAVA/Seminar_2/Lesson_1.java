package Seminar_2;

import java.util.Scanner;

/*Задание 1. Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
Ответ: с1 = а с2 = б
абабабабаб (всего N символов)
*/
public class Lesson_1 {
    public static void main(String[] args) {
    // Получение данных с терминала
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Введите число n: ");
    //Считываем строки из консоли
    String nSting = iScanner.nextLine();
    // Преобразовываем в int
    int n = Integer.parseInt(nSting);
    System.out.printf("Введите число c1: ");
    //Считываем строки из консоли
    String c1 = iScanner.nextLine();
    System.out.printf("Введите число c2: ");
    // Преобразовываем в int
    String c2 = iScanner.nextLine();
    // сканер нужно закрыть
    iScanner.close();

    StringBuilder sres = new StringBuilder();
/* // 1 вариант
    for (int i = 0; i <= n; i++) {
         if (i % 2 == 0){
             sres.append(c1);
         } else {
             sres.append(c2);
         }
        }*/
     // 2 вариант
        //sres.append((c1 + c2).repeat(Math.max(0, n / 2 )));
      //3 варинт
    for (int i = 1; i <= n/2; i++) {
        sres.append(c1+c2);
        }


    System.out.println(sres);
    }

}

