package ua.univer.task3.function;

import ua.univer.task3.Objects.Gem;

import java.util.Scanner;

public class createNewNecklace {
    public static Gem[] createNewNecklace(Gem[] listOfGems, Scanner sc) {
        System.out.println("How many items would your necklace contain");
        int lengthOfNecklace = sc.nextInt();
        Gem [] newNecklace = new Gem[lengthOfNecklace];
        for (int i = 0; i<lengthOfNecklace; i++){
            System.out.println("Enter gem name");
            String gemName = sc.next();
            double price = 0;
            for (int j=0; j<listOfGems.length; j++){
                if (gemName.equals(listOfGems[j].getName())){
                    price = listOfGems[j].getPricePerCarat();
                }
            }
            String transparency = null;
            for (int j=0; j<listOfGems.length; j++){
                if (gemName.equals(listOfGems[j].getName())){
                    transparency = listOfGems[j].getTransparency();
                }
            }
            String classification = null;
            for (int j=0; j<listOfGems.length; j++){
                if (gemName.equals(listOfGems[j].getName())){
                    classification = listOfGems[j].getClassificationGroup();
                }
            }
            System.out.println("Enter it's weight");
            double gemWeight = sc.nextDouble();
            newNecklace[i] = new Gem(gemName, gemWeight, price, transparency, classification);
        }
        return newNecklace;
    }
}
