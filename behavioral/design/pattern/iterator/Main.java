package behavioral.design.pattern.iterator;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Song.SongBuilder songBuilder = new Song.SongBuilder();
        playlist.add(songBuilder.build());
        playlist.add(songBuilder.setName("Mai Hoon na").build());
        playlist.add(songBuilder.setFavourite(true).build());
        playlist.add(songBuilder.setFavourite(true).setName("Kal Hoon na Ho").build());

        System.out.println("Simple Playlist");
        Iterator simple = playlist.getIterator("simple");
        while (simple.hasNext()){
            System.out.println(simple.next());
        }

        System.out.println("\nFavorite Songs");
        Iterator fav = playlist.getIterator("fav");
        while (fav.hasNext()){
            System.out.println(fav.next());
        }

        System.out.println("\nRandom Playlist");
        Iterator random = playlist.getIterator("shuffle");
        while (random.hasNext()){
            System.out.println(random.next());
        }
    }
}
