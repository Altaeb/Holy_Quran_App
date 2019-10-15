package abdelfattah.holyquran;

import java.io.Serializable;

class Surah implements Serializable {

    private final String name;

    private final String mediaFile;

    /**
     * duration of the Surah in seconds
     */
    private final int duration;

    Surah(String name, int duration) {
        this.name = name;
        this.duration = duration;
        this.mediaFile = null;
    }


    public String getName() {
        return name;
    }

    int getDuration() {
        return duration;
    }

    String getMediaFile() {
        return mediaFile;
    }
}
