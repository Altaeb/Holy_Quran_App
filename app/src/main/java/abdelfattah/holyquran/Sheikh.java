package abdelfattah.holyquran;

import java.io.Serializable;
import java.util.ArrayList;

public class Sheikh implements Serializable {

    private final String name;
    private final String photo;
    private final ArrayList<Album> albums;

    Sheikh(String name, String photo) {
        this.name = name;
        this.photo = photo;
        albums = new ArrayList<> ();
    }

    void addAlbum(Album album) {
        albums.add ( album );
    }

    public String getName() {
        return name;
    }

    String getPhoto() {
        return photo;
    }

    ArrayList<Album> getAlbums() {
        return albums;
    }

}
