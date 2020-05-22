package ua.univer.task3.function;

import ua.univer.task3.Objects.Gem;

public class printListOfGems {
    public static void printListOfGems(Gem[] listOfGems) {
        for (int i = 0; i < listOfGems.length; i++) {
            System.out.println(listOfGems[i]);
        }
    }
}
