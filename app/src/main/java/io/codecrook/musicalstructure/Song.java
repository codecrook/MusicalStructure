package io.codecrook.musicalstructure;

public class Song {

    /*Title of the song*/
    private String mSongTitle;

    /*Name of the Artist*/
    private String mArtistName;

    /*Duration of the song*/
    private String mDuration;

    public Song (String songTitle, String artistName, String duration) {
        mSongTitle = songTitle;
        mArtistName = artistName;
        mDuration = duration;
    }

    public String getmSongTitle() {
        return mSongTitle;
    }

    public String getmArtistName() {
        return mArtistName;
    }

    public String getmDuration() {
        return mDuration;
    }
}
