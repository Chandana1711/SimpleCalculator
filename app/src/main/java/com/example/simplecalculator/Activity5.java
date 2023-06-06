package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity5 extends AppCompatActivity {
    TextView tvResults5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        tvResults5=findViewById(R.id.tvResults5);

       double Number1=getIntent().getDoubleExtra("number1",0);
        double Number2=getIntent().getDoubleExtra("number2",0);
        double quot= Number1/Number2;
        tvResults5.setText(String.valueOf(quot));
    }
}