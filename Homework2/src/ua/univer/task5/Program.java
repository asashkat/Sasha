package ua.univer.task5;

public class Program {
    public static void main(String[] args) {
        /*interface Ткань ß abstract class Одеждаß class Костюм.*/

        Suit suit = new Suit("black", 42, "Classic");
        suit.cutInShape();
        suit.sew();
        System.out.println("And here is your suit: "+ suit);

    }
}
