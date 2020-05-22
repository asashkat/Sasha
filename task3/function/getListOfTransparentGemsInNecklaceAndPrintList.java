package ua.univer.task3.function;

import ua.univer.task3.Objects.Gem;

public class getListOfTransparentGemsInNecklaceAndPrintList {
    public static void getListOfTransparentGemsInNecklaceAndPrintList(Gem[] listOfGems, Gem[] newNecklace) {
        System.out.println("Transparent gems in new necklace:");
        Gem [] transparentGemsInNecklace = new Gem[newNecklace.length];
        for (int i = 0; i <newNecklace.length ; i++) {
            if(newNecklace[i].getTransparency().equals(listOfGems[0].getTransparency()));
            int count = 0;
            transparentGemsInNecklace[count] = newNecklace[i];
            count++;
        }
        for (int i = 0; i<transparentGemsInNecklace.length; i++){
            if (transparentGemsInNecklace[i]!=null) {
                System.out.println(transparentGemsInNecklace[i]);
            }
        }
    }
}
