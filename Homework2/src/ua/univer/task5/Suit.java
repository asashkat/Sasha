package ua.univer.task5;

public class Suit extends Cloth implements Textile{
    private String model;

    public Suit(String color, int size, String model) {
        super(color, size);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Suit{" +
                "model='" + model + '\'' +
                "} " + super.toString();
    }

    @Override
    public void sew() {
        System.out.println("Sew each part of textile into 2 parts - pants and jacket");
    }

    @Override
    public void cutInShape() {
        System.out.println("Cut textile into pieces for pants and jacket");
    }
}
