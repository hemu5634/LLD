package behavioral.design.pattern.iterator;

public class Song {
    private String name;
    private boolean favourite;

    private Song(SongBuilder songBuilder){
        this.name = songBuilder.name;
        this.favourite = songBuilder.favourite;
    }

    public String getName(){
        return name;
    }

    public boolean getFavourite(){
        return favourite;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", favourite=" + favourite +
                '}';
    }

    public static class SongBuilder{
        private String name;
        private boolean favourite;

        public SongBuilder(){
            name="Default Song";
            favourite=false;
        }
        public SongBuilder setName(String name){
            this.name=name;
            return this;
        }
        public SongBuilder setFavourite(boolean favourite){
            this.favourite = favourite;
            return this;
        }

        public Song build(){
            return new Song(this);
        }
    }
}
