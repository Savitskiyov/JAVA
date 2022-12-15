package OOP_Seminar_1.DZ;
public class Main {
public static void main(String[] args) {
        Person irina = new Person("Ирина");
        Person vasya = new Person("Вася");
        Person masha = new Person("Маша");
        Person jane = new Person("Женя");
        Person ivan = new Person("Ваня");
        Person ivanPetrovich = new Person("Иван Петрович");
        Person mariaAleksandrovna = new Person("Мария Александровна");
        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);
        gt.appendG(ivanPetrovich, vasya);
        gt.appendG(mariaAleksandrovna, vasya);
        gt.addendBS(ivan, jane);

        System.out.println(new Reserch(gt).spend(irina,
        Relationship.parent));
        System.out.println(new Reserch(gt).spend(vasya, Relationship.grandchildren));

        WriteFile writeF = new WriteFile(gt);
        System.out.println();
        System.out.println("Вывод всего списка:");
        System.out.println(writeF.spend());
        }
        }