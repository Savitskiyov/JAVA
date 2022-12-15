package Seminar_4.Seminar_6;

public class Seminar_4 {

    public static void main(String[] args) {

        Cat cat1 = new Cat(100, "Вася", "Дворняга", "Рыжий", true, 5, 5);
        Cat cat2 = new Cat(200, "Мурка", "Дворняга", "Рыжий", false, 5, 5);
        Cat cat3 = new Cat(300, "Илларион", "Дворняга", "Чёрный", true, 5, 5);
        Cat cat4 = new Cat(400, "Кеша", "Мэйнкун", "Рыжий", true, 5, 5);

        Cat[] cats = new Cat[]{cat1, cat2, cat3, cat4};

        System.out.println(Cat.getCatsByGender(cats, false));
        System.out.println(Cat.getCatsByGender(cats, true));
    }
}
