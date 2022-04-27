package com.example.laboratoryactivity32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText e1;
EditText e2;
TextView tv;
Button add, sub, mul, div, clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.editTextTextPersonName1);
        e2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        tv = (TextView) findViewById(R.id.textView1);
        add = (Button) findViewById(R.id.button1);
        sub = (Button) findViewById(R.id.button2);
        mul = (Button) findViewById(R.id.button3);
        div = (Button) findViewById(R.id.button4);
        clear = (Button) findViewById(R.id.button5);

//        Button when clicked
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer n1 = Integer.parseInt(e1.getText().toString());
                Integer n2 = Integer.parseInt(e2.getText().toString());

                Integer add = n1+n2;
                tv.setText(add.toString());
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer n1 = Integer.parseInt(e1.getText().toString());
                Integer n2 = Integer.parseInt(e2.getText().toString());

                Integer sub = n1-n2;
                tv.setText(sub.toString());
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer n1 = Integer.parseInt(e1.getText().toString());
                Integer n2 = Integer.parseInt(e2.getText().toString());

                Integer mul = n1*n2;
                tv.setText(mul.toString());
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer n1 = Integer.parseInt(e1.getText().toString());
                Integer n2 = Integer.parseInt(e2.getText().toString());

                Integer div = n1-n2;
                tv.setText(div.toString());
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                e1.setText(null);
                e2.setText(null);
                tv.setText(null);
            }
        });
    }
}