package Exceptions_1;

import java.util.Arrays;

/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
 необходимо как-то оповестить пользователя.*/
public class Main {

    public static void main(String[] args) {
        int [] array_1={5,9,8,7,5,6,4,0,3,7};
        int [] array_2={15,97,0,8,5,1,4,0,3,57};
        int [] result = getSub(array_1,array_2);
        System.out.println(Arrays.toString(result));
    }

    private static int[] getSub (int [] arr_1, int [] arr_2){
        if (arr_1==null || arr_2==null){
            throw new RuntimeException("Someone of the arrays is equal to NULL.");
        } else if (arr_1.length!=arr_2.length){
            throw new RuntimeException("Lengths of the arrays should be equal. Lengths are different.");
        }
        int [] result = new int [arr_1.length];
        for (int i = 0; i<arr_1.length;i++){
            result[i]=arr_1[i]-arr_2[i];
        }
        return result;
    }
}
