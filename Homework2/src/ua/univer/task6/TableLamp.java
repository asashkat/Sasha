package ua.univer.task6;

public class TableLamp extends Lamp implements LightSource{

    private int angleToTheTable;

    public TableLamp(String nameOfRoom, int amountOfBulbs, int brightness, int angleToTheTable) {
        super(nameOfRoom, amountOfBulbs, brightness);
        this.angleToTheTable = angleToTheTable;
    }

    public int getAngleToTheTable() {
        return angleToTheTable;
    }

    public void setAngleToTheTable(int angleToTheTable) {
        this.angleToTheTable = angleToTheTable;
    }

    @Override
    public String toString() {
        return "TableLamp{" +
                "angleToTheTable=" + angleToTheTable +
                "} " + super.toString();
    }

    @Override
    public void changeTheBulb() {
        System.out.println("1. Turn off the light. 2. Get out the bulb. 3. Change bulb.");;
    }
}
