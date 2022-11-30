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

//3. Реализовать простой калькулятор + - / * 2 вариант
//
//public class DZ_3 {
//        public static void main(String[] args) {
//                Scanner scanner = new Scanner(System.in);
//                //один раз создали и пользуемся!
//                System.out.println("Enter the first number...");
//                int a = scanner.nextInt();
//                System.out.println("Enter the operator (+ - * /)...");
//                char op = scanner.next().charAt(0);
//                System.out.println("Enter the second number...");
//                int b = scanner.nextInt();
//                switch (op) {
//                        case '+':
//                                System.out.println(a + " + " + b + " = " + add(a, b));
//                                break;
//                        case '-':
//                                System.out.println(a + " - " + b + " = " + minus(a, b));
//                                break;
//                        case '*':
//                                System.out.println(a + " * " + b + " = " + mult(a, b));
//                                break;
//                        case '/':
//                                System.out.println(a + " / " + b + " = " + divide(a, b));
//                                break;
//                        default:
//                                System.out.println("Wrong operation!");
//                }
//                scanner.close();
//        }
//
//        private static int divide(int a, int b) {
//                if (b != 0) return a/b;
//                else
//                        return -1;
//        }
//
//        private static int mult(int a, int b) {
//                return a * b;
//        }
//
//        private static int minus(int a, int b) {
//                return a - b;
//        }
//
//        private static int add(int a, int b) {
//                return a + b;
//        }
//}
