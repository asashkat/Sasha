package ua.univer.task3.function;

import ua.univer.task3.Objects.Gem;

public class getTotalPriceOfNecklace {
    public static void getTotalPriceOfNecklace(Gem[] newNecklace) {
        double totalPrice = 0;
        for (int i = 0; i <newNecklace.length ; i++) {
            totalPrice+=(newNecklace[i].getPricePerCarat()*newNecklace[i].getWeight());
        }
        System.out.println("Total price of gems: "+totalPrice);
    }

}
