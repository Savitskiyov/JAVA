package Seminar_6;

// Создайте несколько экземпляров этого класса, выведите их в консоль.
// 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat,
// выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).
public class Seminar_3 {
    public static void main(String[] args) {

        Cat cat1 = new Cat(100, "Вася", "Дворняга", "Рыжий", true, 5, 5);

        System.out.println(cat1.toString(100));

    }
}
