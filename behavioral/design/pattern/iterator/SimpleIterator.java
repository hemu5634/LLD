package behavioral.design.pattern.iterator;

public class SimpleIterator implements Iterator{
    private Playlist playlist;
    private int index;
    public SimpleIterator(Playlist playlist){
        this.playlist=playlist;
        index =0;
    }
    @Override
    public boolean hasNext() {
        return index<playlist.getList().size();
    }

    @Override
    public Song next() {
        return playlist.getList().get(index++);
    }
}
