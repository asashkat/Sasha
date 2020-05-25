package ua.univer.task2;


public class Program {

        public static void main(String[] args) {
            /*Создать класс Notepad свнутренним классом или классами, с помощью объектов
            которого могут храниться несколько записей наодну дату.*/

            Notepad [] tom = new Notepad[3];
            tom[0] = new Notepad("03/03/2020", "Meeting with Tony");
            tom[1] = new Notepad("03/03/2020", "B-Day party");

             Function.  printAllNotes(tom);
        }


}

