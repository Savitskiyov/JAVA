package Seminar_9;

public class MyArrayDataException extends Exception{

    MyArrayDataException(int i, int j){
        super("В ячейке [" + i + "][" + j + "] не является Int");
    }
}