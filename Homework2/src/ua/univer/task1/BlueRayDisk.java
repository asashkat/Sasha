package ua.univer.task1;

public class BlueRayDisk {

        private String name;
        private String genre;
        Music music;


    public BlueRayDisk(String name, String genre, String catalog, String record) {
        this.name = name;
        this.genre = genre;
        music = new Music(catalog, record);
    }

    @Override
        public String toString() {
            return "BlueRayDisc{" +
                    "name='" + name + '\'' +
                    ", genre='" + genre + '\'' +
                    ", catalog=" + music.catalog +
                    ", record=" + music.record+
                    '}';
        }

        public class Music {
            private String catalog;
            private String record;

            public Music(String catalog, String record) {
                this.catalog = catalog;
                this.record = record;
            }

            void displayMusic(){
                System.out.println("Catalog : "+ catalog+" Record : "+record);
            }
        }
    }


