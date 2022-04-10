package com.bhavuk.mxapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Contact extends AppCompatActivity {
        ListView listView;
        Boolean isPlaying = false;
        int frequency = 0;
        MediaPlayer music;
        int prevPosition = -1;

        String songname[] = {"Distance Love", "Jatt Hunde Aa", "Dil Da Showroom", "Yaarian"};

        Integer imageid1[] = {R.drawable.distancelove2, R.drawable.jatthundeaa2, R.drawable.dildeshowroom2, R.drawable.yaarian2};

        Integer imageid[] = {R.drawable.play, R.drawable.play, R.drawable.play, R.drawable.play};

        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.contact);

            MyListAdapter listAdapter = new MyListAdapter(this, songname, imageid, imageid1);

            listView = findViewById(R.id.list);
            listView.setAdapter(listAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                    if (position == 0) {
                        frequency = 0;
                        if (isPlaying == true) {
                            music.release();
//                            Toast.makeText(Contact.this, "Distance Love Stopped Playing....", Toast.LENGTH_SHORT).show();
                            isPlaying = false;
                            if (prevPosition == position) {
                                frequency = 1;
                            } else {
                                frequency = 0;
                            }
                        }
                        Toast.makeText(Contact.this, "Distance Love Playing....", Toast.LENGTH_SHORT).show();
                        music = MediaPlayer.create(Contact.this, R.raw.distancelove);
                        prevPosition = position;
                        songManager();


                    }
                    if (position == 1) {
                        frequency = 0;
                        if (isPlaying == true) {
                            music.release();
//                            Toast.makeText(Contact.this, "Jatt Hunde Aa Stopped Playing....", Toast.LENGTH_SHORT).show();
                            isPlaying = false;
                            if (prevPosition == position) {
                                frequency = 1;
                            } else {
                                frequency = 0;
                            }
                        }
                        Toast.makeText(Contact.this, "Jatt Hunde Aaa Playing....", Toast.LENGTH_SHORT).show();
                        music = MediaPlayer.create(Contact.this, R.raw.jatthundeaa);
                        prevPosition = position;
                        songManager();
                    }
                    if (position == 2) {
                        frequency = 0;
                        if (isPlaying == true) {
                            music.release();
//                            Toast.makeText(Contact.this, "Dil De Showroom Stopped Playing....", Toast.LENGTH_SHORT).show();
                            isPlaying = false;
                            if (prevPosition == position) {
                                frequency = 1;
                            } else {
                                frequency = 0;
                            }
                        }
                        Toast.makeText(Contact.this, "Dil De Showroom Playing....", Toast.LENGTH_SHORT).show();
                        music = MediaPlayer.create(Contact.this, R.raw.dildeshowroom);
                        prevPosition = position;
                        songManager();
                    }
                    if (position == 3) {
                        frequency = 0;
                        if (isPlaying == true) {
//                            Toast.makeText(Contact.this, "Yaarian Stopped Playing....", Toast.LENGTH_SHORT).show();
                            music.release();
                            isPlaying = false;
                            if (prevPosition == position) {
                                frequency = 1;
                            } else {
                                frequency = 0;
                            }
                        }
                        Toast.makeText(Contact.this, "Yaarian Playing....", Toast.LENGTH_SHORT).show();
                        music = MediaPlayer.create(Contact.this, R.raw.yaarian);
                        prevPosition = position;
                        songManager();
                    }


                }


            });

        }
        void songManager() {
        if (isPlaying == false && frequency == 0) {
            isPlaying = true;
            music.start();
        }
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        if(music.isPlaying())
        {
            music.stop();
            music.release();
        }
    }

    public void onClick(View V)
    {
        super.onUserLeaveHint();
    }
    @Override
    protected void onUserLeaveHint()
    {
        if(music.isPlaying())
        {
            music.stop();
//            mp.release();
        }
        super.onUserLeaveHint();
    }


}