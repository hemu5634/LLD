package behavioral.design.pattern.iterator;

public class FavoriteIterator implements Iterator{
    private Playlist playlist;
    private int index;

    public FavoriteIterator(Playlist playlist){
        this.playlist=playlist;
    }
    @Override
    public boolean hasNext() {
        while(index<playlist.getList().size()){
            if(playlist.getList().get(index).getFavourite())
                return true;
            index++;
        }
        return false;
    }

    @Override
    public Song next() {
        return playlist.getList().get(index++);
    }
}
