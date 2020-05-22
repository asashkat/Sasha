package ua.univer.task1.function;

import ua.univer.task1.data.Album;

public class function {
    public static int getAmountOfPhoto(Album[] photoAlbum) {
        int count = 0;
        for (int i = 0; i<=photoAlbum.length-1; i++){
            if (photoAlbum[i]!=null){
                count++;
            }
        }
        return count;
    }

    public static void AlbumPhotoPrint(Album[] photoAlbum) {
        for (int i = 0; i<photoAlbum.length; i++){
            if (photoAlbum[i]!=null) {
                System.out.println(photoAlbum[i]);
            }
        }
    }


}
