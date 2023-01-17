package OOP_Seminar_5.Seminar;

public class Bottle extends Product {
    private double volume;
    public Bottle(String nameProduct, double cost, double volume) {
        super(nameProduct, cost);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + "volume= " + volume;
    }
}