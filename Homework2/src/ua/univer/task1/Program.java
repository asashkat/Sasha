package ua.univer.task1;

import javax.xml.crypto.Data;

public class Program {
    public static void main(String[] args) {
        /*Создать класс BlueRayDisc с внутренним классом, с помощью объек-тов
         которого можно хранить информацию о каталогах, подкаталогах и записях.*/

        BlueRayDisk[] tom1 = new BlueRayDisk[3];
        tom1[0] = new BlueRayDisk("Jazz", "Old school", "Soft jazz", "Old Town");
        tom1[1] = new BlueRayDisk("Jazz", "Old school", "Cool jazz", "Bird");
        tom1[2] = new BlueRayDisk("Jazz", "Old school", "My jazz", "My tape 1");

        Function. printAllRecordsOnDisk(tom1);


    }
}