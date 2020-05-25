package ua.univer.task3;

public class Function {
    static void printAllFilmsInPreview(Film[] preview) {
        for (int i = 0; i < preview.length; i++) {
            if (preview[i] != null) {
                System.out.println(preview[i]);
            }
        }
    }
}