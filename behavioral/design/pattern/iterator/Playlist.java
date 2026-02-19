package behavioral.design.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> playlist;

    public Playlist() {
        playlist = new ArrayList<>();
    }
    public void add(Song song){
        playlist.add(song);
    }
    public void remove(Song song){
        playlist.remove(song);
    }

    public Iterator getIterator(String type){
        switch (type){
            case "simple" :
                return new SimpleIterator(this);
            case "fav" :
                return new FavoriteIterator(this);
            case "shuffle" :
                return new ShuffleIterator(this);
            default:
                return null;
        }
    }

    public List<Song> getList() {
        return playlist;
    }
}
