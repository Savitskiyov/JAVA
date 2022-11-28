package Seminar_1;
//Реализовать простой калькулятор + - / *

import java.util.Scanner;

public class DZ_3 {

    public static void main(String[] args) {
        CALC();

    }
public static void CALC (){
        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        num1 = reader.nextDouble();
        System.out.print("Введите второе число: ");
        num2 = reader.nextDouble();
        System.out.print("\nВыберете оператор (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch(op) {
        case '+': ans = num1 + num2;
        break;
        case '-': ans = num1 - num2;
        break;
        case '*': ans = num1 * num2;
        break;
        case '/': ans = num1 / num2;
        break;
        default:  System.out.printf("Не правильно указан оператор");
        return;
        }
        System.out.print("\nРезультат выражения:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
        }




        }