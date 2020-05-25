package ua.univer.task2;

public class Notepad {

        private String data;
        Note notes;

    public Notepad(String data) {
        this.data = data;
    }

    Notepad(String data, String note){
            this.data = data;
            notes = new Note(note);
        }
        public void displayNotepad(){
            System.out.println("Notepad Name: "+ data+" Note : " + notes.note);
        }

        public class Note{
            private String note;

            Note(String note){
                this.note = note;
            }
            void displayNote(){
                System.out.println( " Note: " + note);
            }
        }
    }

