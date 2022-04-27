package com.example.laboratory52;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    EditText textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textInputEditText = findViewById(R.id.textInputEditText);
        textInputEditText2 = findViewById(R.id.textInputEditText2);
        textInputEditText3 = findViewById(R.id.textInputEditText3);
        textInputEditText4 = findViewById(R.id.textInputEditText4);
        textInputEditText5 = findViewById(R.id.textInputEditText5);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent myIntent = new Intent(MainActivity.this, SecondClass.class);
        myIntent.putExtra("key", textInputEditText.getText().toString());
        myIntent.putExtra("key2", textInputEditText2.getText().toString());
        myIntent.putExtra("key3", textInputEditText3.getText().toString());
        myIntent.putExtra("key4", textInputEditText4.getText().toString());
        myIntent.putExtra("key5", textInputEditText5.getText().toString());
        startActivity(myIntent);
    }
}