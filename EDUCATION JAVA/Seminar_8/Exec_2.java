package Seminar_8;


// 2. Если необходимо, исправьте данный код
public class Exec_2 {
    public static void main(String[] args) {
        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8}; // добавим инициализированный массив
        int d = 0; //Вынесем за пределы проверки исключения
        try {
            double catchedRes1 = intArray[7] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Индекс вне диапазона массива, крайний индекс: " + (intArray.length - 1));
            //Так как у нас две рабочие переменные, массив и переменная d, добавим перед делением верный ли размер массива
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}