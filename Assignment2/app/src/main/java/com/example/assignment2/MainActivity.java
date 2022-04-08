package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {

    EditText username;
    EditText password;
    Button login;
    String s1,s2;
    TextToSpeech ts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        ts = new TextToSpeech(MainActivity.this, this);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s1 = username.getText().toString();
                s2 = password.getText().toString();

                validate();

            }
        });





    }

    void validate()
    {
        if(s1.contentEquals("Bhavuk") && s2.contentEquals("9876543"))
        {
            Toast.makeText(MainActivity.this,"Login success",Toast.LENGTH_LONG).show();

            ts.speak("Login Success",TextToSpeech.QUEUE_ADD,null);

        }
        else
        {
            Toast.makeText(MainActivity.this,"Login failed",Toast.LENGTH_LONG).show();
            ts.speak("Login failed",TextToSpeech.QUEUE_ADD,null);
        }
    }

    @Override
    public void onInit(int i) {

        ts.setLanguage(Locale.ENGLISH);
        ts.setSpeechRate(0.8f);

    }
}