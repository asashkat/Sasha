package ua.univer.task3;

public class Film {
    private String name;
    Info info;

    public Film(String name) {
        this.name = name;
    }

    public Film(String name, String time, String genre, String author) {
        this.name = name;
        info = new Info(time, genre, author);
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", time=" + info.time +
                ", genre=" + info.genre +
                ", author=" + info.author +
                '}';
    }

    public class Info{
        private String time;
        private String genre;
        private String author;

        public Info(String time, String genre, String author) {
            this.time = time;
            this.genre = genre;
            this.author = author;
        }

        @Override
        public String toString() {
            return "Info{" +
                    "time='" + time + '\'' +
                    ", genre='" + genre + '\'' +
                    ", author='" + author + '\'' +
                    '}';
        }
    }
}
