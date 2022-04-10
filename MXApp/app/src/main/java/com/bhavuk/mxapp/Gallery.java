package com.bhavuk.mxapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Gallery extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);
        mp = new MediaPlayer().create(Gallery.this, R.raw.highend2);
        mp.start();
    }
        @Override
            public void onBackPressed()
            {
                super.onBackPressed();
                if(mp.isPlaying())
                {
                    mp.stop();
                    mp.release();
                }
            }

    public void onClick(View V)
    {
        super.onUserLeaveHint();
    }
    @Override
    protected void onUserLeaveHint()
    {
        if(mp.isPlaying())
        {
            mp.stop();
//            mp.release();
        }
        super.onUserLeaveHint();
    }

    }

