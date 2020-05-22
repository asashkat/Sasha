package ua.univer.task3.Objects;

import java.util.Comparator;

public class Gem implements Comparable<Gem> {
    private String name;
    private double weightPerCarat;
    private double pricePerCarat;
    private String transparency;
    private String classificationGroup; // precious/semi-precious

    public Gem(String name, double weight, double pricePerCarat, String transparency, String classificationGroup) {
        this.name = name;
        this.weightPerCarat = weight;
        this.pricePerCarat = pricePerCarat;
        this.transparency = transparency;
        this.classificationGroup = classificationGroup;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weightPerCarat;
    }

    public void setWeight(double weight) {
        this.weightPerCarat = weight;
    }

    public double getPricePerCarat() {
        return pricePerCarat;
    }

    public void setPricePerCarat(double pricePerCarat) {
        this.pricePerCarat = pricePerCarat;
    }

    public String getTransparency() {
        return transparency;
    }

    public void setTransparency(String transparency) {
        this.transparency = transparency;
    }

    public String getClassificationGroup() {
        return classificationGroup;
    }

    public void setClassificationGroup(String classificationGroup) {
        this.classificationGroup = classificationGroup;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        return name == this.name;
    }

    @Override
    public int hashCode() {
        return (int) weightPerCarat * hashCode();
    }

    @Override
    public String toString() {
        return "Gem{" +
                "name='" + name + '\'' +
                ", weight=" + weightPerCarat +
                ", pricePerCarat=" + pricePerCarat +
                ", transparency='" + transparency + '\'' +
                ", classificationGroup='" + classificationGroup + '\'' +
                '}';
    }

    public static Comparator<Gem> PriceComparator = new Comparator<Gem>() {

        @Override
        public int compare(Gem o1, Gem o2) {
            return (int) o1.getPricePerCarat() - (int) o2.getPricePerCarat();
        }

    };

    @Override
    public int compareTo(Gem o) {
        return 0;
    }
}
