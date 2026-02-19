package behavioral.design.pattern.iterator;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ShuffleIterator implements Iterator{
    private Playlist playlist;
    private int index;
    private List<Song> shuffledSongs;

    public ShuffleIterator(Playlist playlist){
        this.playlist=playlist;
        index=0;
        shuffledSongs = playlist.getList();
        Collections.shuffle(shuffledSongs);
    }
    @Override
    public boolean hasNext() {
        return index<shuffledSongs.size();
    }

    @Override
    public Song next() {
        return shuffledSongs.get(index++);
    }
}
