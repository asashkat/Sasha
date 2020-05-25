package ua.univer.task6;

public class Lamp {
    private String nameOfRoom;
    private int amountOfBulbs;
    private int brightness;

    public Lamp(String nameOfRoom, int amountOfBulbs, int brightness) {
        this.nameOfRoom = nameOfRoom;
        this.amountOfBulbs = amountOfBulbs;
        this.brightness = brightness;
    }

    public String getNameOfRoom() {
        return nameOfRoom;
    }

    public void setNameOfRoom(String nameOfRoom) {
        this.nameOfRoom = nameOfRoom;
    }

    public int getAmountOfBulbs() {
        return amountOfBulbs;
    }

    public void setAmountOfBulbs(int amountOfBulbs) {
        this.amountOfBulbs = amountOfBulbs;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "nameOfRoom='" + nameOfRoom + '\'' +
                ", amountOfBulbs=" + amountOfBulbs +
                ", brightness='" + brightness + '\'' +
                '}';
    }


    public void onOff(int key) {

        switch (key){
            case 0:{
                System.out.println("Lamp is off");
            }
            break;
            case 1:{
                System.out.println("Lamp is on");;
            }
            break;
        }
    }

}
