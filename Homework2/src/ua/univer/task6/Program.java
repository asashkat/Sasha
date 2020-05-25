package ua.univer.task6;

public class Program {
    public static void main(String[] args) {
        /*interface Источник Света ß class Лампа ß class Настольная Лампа*/
        TableLamp mylamp = new TableLamp("Cabinet", 1, 75, 30);
        mylamp.onOff(0);
        mylamp.changeTheBulb();
        mylamp.onOff(1);

    }
}
