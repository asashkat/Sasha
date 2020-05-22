package ua.univer.task3.function;

import ua.univer.task3.Objects.Gem;

public class getTotalWeigthOfNecklace {
    public static void getTotalWeigthOfNecklace(Gem[] newNecklace) {
        double totalWeight = 0;
        for (int i = 0; i <newNecklace.length ; i++) {
            totalWeight+=newNecklace[i].getWeight();
        }
        System.out.println("Total weight of gems: "+totalWeight);
    }

}
