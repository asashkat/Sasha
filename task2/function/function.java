package ua.univer.task2.function;

import ua.univer.task2.Data.Region;

public class function {
    public static void PrintRegionsInformation(Region[] regions) {
        System.out.println("Amount of regions: "+ regions.length);
        for (int i = 0; i<regions.length; i++){
             System.out.println(regions[i]);
        }
    }

    public static Region[] CreateArrayOfRegions() {
        Region[] regionsUkraine = new Region[5];
        regionsUkraine [0] = new Region(1, "Kiev", "Kievs`ka", 312);
        regionsUkraine [1] = new Region(2, "Dnipro", "Dniprovs`ka", 426);
        regionsUkraine [2] = new Region(3, "Lviv", "Lvivs`ka", 312);
        regionsUkraine [3] = new Region(4, "Odessa", "Odess`ka", 312);
        regionsUkraine [4] = new Region(5, "Lutsk", "Volyns`ka", 312);
        return regionsUkraine;
    }
}
