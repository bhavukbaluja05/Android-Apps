package com.bhavuk.mxapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] songname;
    private final Integer[] imageid;
    private final Integer[] imageid1;

    public MyListAdapter(Activity context, String[] songname, Integer[] imageid, Integer[] imageid1) {
        super(context, R.layout.component_music, songname);

        this.context=context;
        this.songname=songname;
        this.imageid=imageid;
        this.imageid1=imageid1;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.component_music, null,true);

        ImageView imageView1 = (ImageView) rowView.findViewById(R.id.songimg);
        TextView textView = (TextView) rowView.findViewById(R.id.songname);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.playbuttonimg);

        textView.setText(songname[position]);
        imageView.setImageResource(imageid[position]);
        imageView1.setImageResource(imageid1[position]);


        return rowView;
    }
}
