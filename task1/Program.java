package ua.univer.task1;

import java.util.Arrays;
import java.util.Scanner;

import ua.univer.task1.data.Album;
import ua.univer.task1.function.function;

public class Program {
    public static void main(String[] args) {
        /*Создать  объект  класса Фотоальбом,  используя  классы Фотография,Страница.
        Методы: задать название фотографии, дополнить фотоальбом фотографией, вывести наконсоль количество фотографий*/

        Album[] photoAlbum = new Album[3];
        photoAlbum[0] = new Album(1, "01/01/2002", 1, "New Year");
        photoAlbum[1] = new Album(2, "13/08/2002", 2, "B-Day");
        photoAlbum[2] = new Album(3, "20/09/2002", 3, null);


        System.out.println("1.Add name to photo");
        System.out.println("2. Add photo");
        System.out.println("3. Print amount of photos");

        Scanner sc = new Scanner(System.in);

        while (true){
            int key = sc.nextInt();
            switch (key){
                case 1:{
                    System.out.println("Enter photo id");
                    int inputId = sc.nextInt();
                    System.out.println("Enter picture right");
                    photoAlbum[inputId-1].setPhotoName(sc.next());
                }
                break;
               case 2:{
                    int count = function. getAmountOfPhoto(photoAlbum);
                    System.out.println("Enter new photo data");
                    String newPhotoData = sc.next();
                    System.out.println("Enter new photo name");
                    String newPhotoName = sc.next();
                    if (count<photoAlbum.length) {
                        photoAlbum[count] = new Album(count + 1, newPhotoData, count + 1, newPhotoName);
                    }
                    else{
                        photoAlbum = Arrays.copyOf(photoAlbum, (photoAlbum.length*2));
                        photoAlbum[count] = new Album(count + 1, newPhotoData, count + 1, newPhotoName);
                    }
                }
                break;
                case 3:{
                    int count = function. getAmountOfPhoto(photoAlbum);
                    System.out.println("Total amount of photos: " + count);
                }
                break;
            }

            function. AlbumPhotoPrint(photoAlbum);
        }


     }




}
