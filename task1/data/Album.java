package ua.univer.task1.data;

public class Album extends Page {
     private String photoName;


    public Album(int id, String data, int pageId, String photoName) {
        super(id, data, pageId);
        this.photoName = photoName;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    @Override
    public String toString() {
        return "Album{" +
                "photoName='" + photoName + '\'' +
                "} " + super.toString();
    }
}
