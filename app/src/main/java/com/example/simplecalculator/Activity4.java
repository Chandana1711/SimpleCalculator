package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {
    TextView tvResults4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        tvResults4=findViewById(R.id.tvResults4);

        int Number1= getIntent().getIntExtra("number1",0);
        int Number2=getIntent().getIntExtra("number2",0);
        int prod= Number1*Number2;

        tvResults4.setText(String.valueOf(prod));
    }
}