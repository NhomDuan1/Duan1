package com.example.duan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class song_acti extends AppCompatActivity {
    /* ImageButton btPlay;
        MediaPlayer mediaPlayer;
        ListView lvsong;
        int i = 0;
        List<music> list = new ArrayList<>();
        TextView song_name_acti, artistName;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

          /* btPlay = findViewById(R.id.btPlay);

        lvsong = findViewById(R.id.lvsong);
        artistName = findViewById(R.id.artistName);
        song_name_acti = findViewById(R.id.song_name_acti);
        list = music_dao.getAll(song_acti.this);
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    btPlay.setImageResource(R.drawable.play);
                }else {
                    mediaPlayer.start();
                    btPlay.setImageResource(R.drawable.pause);

                }
            }
        });*/

    }
}