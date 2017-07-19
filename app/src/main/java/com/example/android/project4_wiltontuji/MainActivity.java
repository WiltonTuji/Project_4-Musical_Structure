package com.example.android.project4_wiltontuji;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout music = (RelativeLayout) findViewById(R.id.music_view);
        RelativeLayout artist = (RelativeLayout) findViewById(R.id.artist_view);
        RelativeLayout album = (RelativeLayout) findViewById(R.id.album_view);
        RelativeLayout nowPlaying = (RelativeLayout) findViewById(R.id.now_playing);

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musicIntent = new Intent(MainActivity.this, MusicActivity.class);
                startActivity(musicIntent);

            }
        });

        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(artistIntent);

            }
        });

        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(albumIntent);

            }
        });

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);

            }
        });
    }
}
