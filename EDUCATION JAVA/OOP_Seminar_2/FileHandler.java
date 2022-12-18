package OOP_Seminar_2;

public class FileHandler implements Writable {

    @Override
    public void save() {
        System.out.println("Сохранили");
    }

    @Override
    public Object read() {
        return null;
    }

    public void test(){}
}