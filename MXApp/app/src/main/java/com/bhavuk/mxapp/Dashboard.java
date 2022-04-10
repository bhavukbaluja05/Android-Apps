package com.bhavuk.mxapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        Button button1= (Button)findViewById(R.id.button1);
        Button button2= (Button)findViewById(R.id.button2);
        Button button3= (Button)findViewById(R.id.button3);
            button1.setOnClickListener((View.OnClickListener)(new View.OnClickListener(){
                public final void onClick(View it)
                {
                    Intent i=new Intent(Dashboard.this,About.class);
                    startActivity(i);
                }
            }));
            button2.setOnClickListener((View.OnClickListener)(new View.OnClickListener(){
                public final void onClick(View it)
                {
                    Intent i=new Intent(Dashboard.this,Contact.class);
                    startActivity(i);
                }
            }));
            button3.setOnClickListener((View.OnClickListener)(new View.OnClickListener(){
                public final void onClick(View it)
                {
                    Intent i=new Intent(Dashboard.this,Gallery.class);
                    startActivity(i);
                }
            }));
    }
}
