package abdelfattah.holyquran;

import java.io.Serializable;
import java.util.ArrayList;

class Album implements Serializable {

    private final String name;
    private final Sheikh sheikh;
    private final String cover;
    private final ArrayList<Surah> surah;

    Album(String name, Sheikh sheikh, String cover) {
        this.name = name;
        this.sheikh = sheikh;
        this.cover = cover;
        surah = new ArrayList<> ();
    }

    void addSurah(Surah surah) {
        this.surah.add ( surah );
    }

    public String getName() {
        return name;
    }

    public Sheikh getSheikh() {
        return sheikh;
    }

    ArrayList<Surah> getSurah() {
        return surah;
    }

    String getCover() {
        return cover;
    }

}