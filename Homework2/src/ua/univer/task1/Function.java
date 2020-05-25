package ua.univer.task1;

public class Function {

    static void printAllRecordsOnDisk(BlueRayDisk[] tom1) {
        for (int i = 0; i < tom1.length; i++) {
            if (tom1[i] != null) {
                System.out.println(tom1[i]);
            }
        }
    }
}
