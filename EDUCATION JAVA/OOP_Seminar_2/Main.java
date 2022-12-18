package OOP_Seminar_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Radio radio = new Radio();

        FileHandler fileHandler = new FileHandler();
        cat1.setWritable(fileHandler);
        cat1.save();

        List<Speakable> speakables = new ArrayList<>();
        speakables.add(cat1);
        speakables.add(dog1);
        speakables.add(radio);
        speakAll(speakables);
    }

    public static void speakAll(List<Speakable> speakables){
        for (Speakable speakable: speakables){
            speakable.speak();
        }
    }
}
