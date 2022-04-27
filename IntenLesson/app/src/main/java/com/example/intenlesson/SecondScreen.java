package com.example.intenlesson;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondScreen extends AppCompatActivity {

    TextView textOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        textOutput = findViewById(R.id.textView);
        textOutput.setText(getIntent().getExtras().getString("myKey"));
    }
}
