package OOP_Seminar_2.DZ;

public class PersonMan extends Person {

    public PersonMan(String name, int age) {
        super(name, age);

        Gender gender = Gender.man;
        this.gender = gender;
    }

}