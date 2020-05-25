package ua.univer.task2;

public class Function {
    static void printAllNotes(Notepad[] tom) {
        for (int i = 0; i <tom.length; i++) {
            if (tom[i]!=null) {
                tom[i].displayNotepad();
            }
        }
    }
}
