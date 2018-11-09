package io.codecrook.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Thappad", "Raftaar", "3.54"));
        songs.add(new Song("Swag Mera Desi", "Raftaar", "4.06"));
        songs.add(new Song("Anime Hentai", "Raftaar", "4.44"));
        songs.add(new Song("Mantoiyat", "Raftaar", "3.13"));
        songs.add(new Song("Gaddi", "Bohemia", "3.12"));
        songs.add(new Song("Patola", "Bohemia & Guru", "3.33"));
        songs.add(new Song("Diwana", "Bohemia", "4.21"));
        songs.add(new Song("Zamana Jali", "Bohemia", "3.05"));


        SongAdapter playlistItemsAdapter = new SongAdapter(this, songs);

        ListView playlistView = (ListView) findViewById(R.id.playlist_list_view);

        playlistView.setAdapter(playlistItemsAdapter);

        //Add onItemClickListener

        playlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Song songToplay = songs.get(position);

                Intent songPlayIntent = new Intent(PlaylistActivity.this, PlayerActivity.class);
                songPlayIntent.putExtra("song name", songToplay.getmSongTitle());
                songPlayIntent.putExtra("artist name", songToplay.getmArtistName());
                songPlayIntent.putExtra("duration", songToplay.getmDuration());

                startActivity(songPlayIntent);
            }
        });
    }
}
