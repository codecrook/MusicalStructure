package io.codecrook.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Thappad", "Raftaar", "3.20"));
        songs.add(new Song("Swag Mera Desi", "Raftaar", "3.20"));
        songs.add(new Song("Anime Hentai", "Raftaar", "3.20"));

        SongAdapter itemsAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.playlist_list_view);

        listView.setAdapter(itemsAdapter);
    }
}
