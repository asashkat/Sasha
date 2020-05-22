package ua.univer.task2.Data;

import java.util.Arrays;

public class Country {
    private String countryCapital;
    private Region[] regionList;

    public Country(String countryCapital, Region[] regionList) {
        this.countryCapital = countryCapital;
        this.regionList = regionList;
    }

    public String getCountryCapital() {
        return countryCapital;
    }

    public void setCountryCapital(String countryCapital) {
        this.countryCapital = countryCapital;
    }

    public Region[] getRegionList() {
        return regionList;
    }

    public void setRegionList(Region[] regionList) {
        this.regionList = regionList;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryCapital='" + countryCapital + '\'' +
                ", regionList=" + Arrays.toString(regionList) +
                '}';
    }
}
