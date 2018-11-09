package io.codecrook.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PlayerActivity extends AppCompatActivity {

    TextView songTitle, artistName, duration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        songTitle = findViewById(R.id.song_name_text_view);
        artistName = findViewById(R.id.artist_text_view);
        duration = findViewById(R.id.duration_text_view);

        songTitle.setText(getIntent().getExtras().getString("song name"));
        artistName.setText(getIntent().getExtras().getString("artist name"));
        duration.setText(getIntent().getExtras().getString("duration"));

    }
}
