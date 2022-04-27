package com.example.laboratory52;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondClass extends AppCompatActivity {

    TextView textView2, textView3, textView4, textView5, textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondclass);

        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);

        textView2.setText(getIntent().getExtras().getString("key"));
        textView3.setText(getIntent().getExtras().getString("key2"));
        textView4.setText(getIntent().getExtras().getString("key3"));
        textView5.setText(getIntent().getExtras().getString("key4"));
        textView6.setText(getIntent().getExtras().getString("key5"));
    }
}
