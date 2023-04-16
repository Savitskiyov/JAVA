package Seminar_8;

public class Exec_3 {
    public static void main(String[] args) { // throws Exception Его можно использовать, чтобы передавать исключения
        // по стеку вызовов, тут никогда не сработает
        try {
            int a = 5;
            int b = 3;
            System.out.println(a / b);
            printSum(null, 234);
            int[] abc = { 1, 2 }; //Возможно массив будет использоваться где-то еще
            abc[0] = 9;
        } catch (IndexOutOfBoundsException ex) { // Эти исключения переносим по порядку перед супер-классом
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (NullPointerException ex) { //Если в метод передать
            System.out.println("Указатель не может указывать на null!");
        } catch (Throwable ex) { //супер-класс должен быть всегда после наследников
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) {  // throws FileNotFoundException никаким образом не подходит в этом методе
        System.out.println(a + b);
    }
}