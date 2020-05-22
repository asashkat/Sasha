package ua.univer.task2.Data;

import ua.univer.task2.Data.City;

public class Region extends City {
    private String regionName;
    private double square;

    public Region(int id, String cityName, String regionName, double square) {
        super(id, cityName);
        this.regionName = regionName;
        this.square = square;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "Region{" +
                "regionName='" + regionName + '\'' +
                ", square=" + square +
                "} " + super.toString();
    }
}
