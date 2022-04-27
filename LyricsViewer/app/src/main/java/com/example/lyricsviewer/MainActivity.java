package com.example.lyricsviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    Button button1,button2,button3,button4,button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstIntent();
            }
        });
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondIntent();
            }
        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thirdIntent();
            }
        });
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fourthIntent();
            }
        });
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fifthIntent();
            }
        });
    }

    public void firstIntent() {
        Intent firstIntent = new Intent (this, Paraluman.class);
        startActivity(firstIntent);
    }

    public void secondIntent() {
        Intent secondIntent = new Intent(this, Perfect.class);
        startActivity(secondIntent);
    }
    public void thirdIntent() {
        Intent thirdIntent = new Intent(this, LittleThings.class);
        startActivity(thirdIntent);
    }
    public void fourthIntent() {
        Intent fourthIntent = new Intent(this, MilesApart.class);
        startActivity(fourthIntent);
    }
    public void fifthIntent() {
        Intent fifthIntent = new Intent(this, BestPart.class);
        startActivity(fifthIntent);
    }
}