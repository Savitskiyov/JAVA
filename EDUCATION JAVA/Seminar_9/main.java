package Seminar_9;

import java.util.Scanner;


/*1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.+
        2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
        Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
        должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
        3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException
        и MyArrayDataException и вывести результат расчета.
        */

public class main {
    public static void main(String[] args) {

        try {
            newArray(4,4);
        } catch (MyArraySizeException eSize)
        {
            System.out.println("Размер массива не соответствует 4х4");
        } catch (MyArrayDataException eData)
        {eData.printStackTrace();}


    }

    //метод, подающий на вход двумерный строковый массив заданной размерности
    public static void newArray(int width, int height) throws MyArraySizeException, MyArrayDataException {
        if (width != 4) {
            throw new MyArraySizeException();
        }
        {
            if (height != 4) {
                throw new MyArraySizeException();
            }
            String[][] array = new String[width][height];
            System.out.println("Введите данные в массив:");
            Scanner arrData = new Scanner(System.in);
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    String arrString = arrData.nextLine();
                    array[i][j] = arrString;
                }
            }
            System.out.println("массив записан");

            //преобразование строк в int и суммирование
            int sum = 0;
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    try {
                        int arrInt = Integer.parseInt(array[i][j]);
                        sum += arrInt;
                    } catch (NumberFormatException eData) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
            System.out.println("Сумма элементов массива = " + sum);
        }
    }



}