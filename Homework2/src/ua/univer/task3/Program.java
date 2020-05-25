package ua.univer.task3;

import java.util.FormatFlagsConversionMismatchException;

public class Program {
    public static void main(String[] args) {
        /*Создать класс Фильмс внутренним классом, с помощью объектов которого можно
        хранить информацию опродолжительности, жанре ирежиссерах фильма.*/
        Film[] preview = new Film[3];
        preview[0] = new Film("Titanic", "2:21:20", "Drama", "Mr. X");
        preview[1] = new Film("Animals", "1:15:05", "Documental", "Mr. Y");


        Function. printAllFilmsInPreview(preview);
    }
}
