package Seminar_1;



//Вывести все простые числа от 1 до 1000

public class DZ_2 {
    public static void main(String[] args) {
        int input = 1000;
        for (int i = 0; i < input; i++) {
            if(Function_Check(i))
                System.out.println(i);
        }
    }

    // Логика проверк  простого числа
    public static boolean Function_Check(int i) {
        if(i == 1)
            return false;
        else if(i % 2 == 0 & i != 2 || i % 3 == 0 & i != 3)
            return false;
        for(int n = 5; i >= n * n; n += 6) {
            if(i % n == 0  || i % (n + 2) == 0)
                return false;
        }
        return true;
    }
}