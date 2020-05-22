package ua.univer.task3.Objects;

import ua.univer.task3.Objects.Gem;

import java.util.Arrays;

public class Necklace {
    private Gem[]  list;
    private double priceOfNecklace;

    public Necklace(Gem[] list, double priceOfNecklace) {
        this.list = list;
        this.priceOfNecklace = priceOfNecklace;
    }

    public Gem[] getList() {
        return list;
    }

    public void setList(Gem[] list) {
        this.list = list;
    }

    public double getPriceOfNecklace() {
        return priceOfNecklace;
    }

    public void setPriceOfNecklace(double priceOfNecklace) {
        this.priceOfNecklace = priceOfNecklace;
    }

    @Override
    public String toString() {
        return "Necklace{" +
                "list=" + Arrays.toString(list) +
                ", priceOfNecklace=" + priceOfNecklace +
                '}';
    }
}
