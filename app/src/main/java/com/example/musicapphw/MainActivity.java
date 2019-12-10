package com.example.musicapphw;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button =   this.findViewById(R.id.button);
        final MediaPlayer[] mp = {MediaPlayer.create(this, R.raw.sample1)};
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(mp[0].isPlaying()){
                    mp[0].stop();
                    mp[0] = MediaPlayer.create(getApplicationContext(),R.raw.sample1);

                }
                else mp[0].start();

            }
        });


    }



}
