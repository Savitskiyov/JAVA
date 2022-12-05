package Seminar_3;
// Заполнить список названиями планет Солнечной системы в произольном порядке с повторениями
// Вывести название каждой планеты и количество его повторений в списке
// Пройди по списку и удалить повторяющиеся элементы

import java.util.ArrayList;
import java.util.List;

public class Lesson_4 {
    public static void main(String[] args) {
        String[] SunSystem = new String[]{"Меркурий", "Венера", "Земля", "Марс"};
        List<String> planets = new ArrayList<String>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        System.out.println(planets);
        for (int i = 0; i < 15; i++) {
            planets.add(SunSystem[(int) (Math.random() * 3)]);

        }


        List<String> Uniqueplanets = new ArrayList<String>();
        for (String planet : planets) {
            if (!Uniqueplanets.contains(planet)) {
                Uniqueplanets.add(planet);
            }
        }

        System.out.println(Uniqueplanets);
        System.out.println("-------------------------------");
        Byte[] CountPlanets = new Byte[Uniqueplanets.size()];

        for (int i = 0; i < CountPlanets.length; i++) {
            CountPlanets[i] = 0;
        }

        for (int i = 0; i < planets.size(); i++) {
            for (int j = 0; j < Uniqueplanets.size(); j++) {
                if (planets.get(i).equals(Uniqueplanets.get(j))) {
                    CountPlanets[j]++;
                }
            }
        }
        for (int i = 0; i < Uniqueplanets.size(); i++) {
            System.out.printf("Планета %s встречается в списке %d раз\n", Uniqueplanets.get(i), CountPlanets[i]);
        }


    }

}