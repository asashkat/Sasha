package ua.univer.task5;

abstract class Cloth {

    private String color;
    private int size;

    public Cloth(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }

    public abstract void sew();





}
