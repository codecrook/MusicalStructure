package io.codecrook.musicalstructure;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {


    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.playlist_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView songTitleTextView = (TextView) listItemView.findViewById(R.id.song_name);
        songTitleTextView.setText(currentSong.getmSongTitle());


        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_name);
        artistTextView.setText(currentSong.getmArtistName());

        TextView durationTextView = (TextView) listItemView.findViewById(R.id.song_duration);
        durationTextView.setText(currentSong.getmDuration());


        return listItemView;
    }

}
