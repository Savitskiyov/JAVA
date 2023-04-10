package Exceptions_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив. Метод должен пройтись по каждому элементу и проверить что он не равен null.
// А теперь реализуйте следующую логику:
//        Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//        Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.checkArray(
                Arrays.asList(
                        1, 3, 4, null, 15, null, 45, 10)
        );
    }


    public void checkArray(List<Integer> list) {
        boolean Error = false;

        for (int i = 0; i < list.size(); i++) {
            var item = list.get(i);
            if (item == null) {
                Error = true;
                System.out.println("Value № " + (i + 1) + " is null");

            } else
                System.out.println(item);

        }

        if (Error) {
            throw new NullPointerException("Null exception");
        }


    }

}
