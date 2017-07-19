package com.example.android.project4_wiltontuji;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        RelativeLayout nowPlaying = (RelativeLayout) findViewById(R.id.now_playing);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MusicActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);

            }
        });
    }
}
