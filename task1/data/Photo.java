package ua.univer.task1.data;

public class Photo {
    private int Photoid;
    private String data;

    public Photo(int photoid, String data) {
        Photoid = photoid;
        this.data = data;
    }

    public int getPhotoid() {
        return Photoid;
    }

    public void setPhotoid(int photoid) {
        Photoid = photoid;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==this){
            return true;
        }
        if (obj.getClass()!=this.getClass()||obj==null){
            return false;
        }
        return Photoid ==this.Photoid;
    }

    @Override
    public int hashCode() {
        return 31* Photoid;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + Photoid +
                ", data='" + data + '\'' +
                 '\'' +
                '}';
    }
}
