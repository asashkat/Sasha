package ua.univer.task3.function;

import ua.univer.task3.Objects.Gem;

public class createListOfGems {
    public static Gem[] createListOfGems() {
        Gem [] listOfGems = new Gem[6];
        listOfGems[0] = new Gem("Diamond",0.2, 800, "Transparent", "Precious");
        listOfGems[1] = new Gem("Emerald",0.2, 670, "Transparent", "Precious");
        listOfGems[2] = new Gem("Ruby",0.2, 650, "Transparent", "Precious");
        listOfGems[3] = new Gem("Amethyst",0.2, 150, "Transparent", "Semi-precious");
        listOfGems[4] = new Gem("Onyx",0.2, 50, "Semi-transparent", "Semi-precious");
        listOfGems[5] = new Gem("Topaz",0.2, 100, "Transparent", "Semi-precious");
        return listOfGems;

    }
}
