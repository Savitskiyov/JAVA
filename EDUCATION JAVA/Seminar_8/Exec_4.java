package Seminar_8;

import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Exec_4 {
    public static void main(String[] args) throws Exception{ //Говорим что бросим в методе исключение в стеке вызовов
        System.out.println("Введите строку: ");
        String userInput = new Scanner(System.in).nextLine();
        if (userInput.equals("")) {
            throw new Exception("Пустые строки вводить нельзя. Завершение программы"); //Бросаем исключение на пустую строку
        }
        System.out.println(userInput);
    }
}