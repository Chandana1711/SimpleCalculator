package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    TextView tvResults3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        tvResults3=findViewById(R.id.tvResults3);

        int Number1= getIntent().getIntExtra("number1",0);
        int Number2=getIntent().getIntExtra("number2",0);
        int diff= Number1-Number2;
        tvResults3.setText(String.valueOf(diff));
    }
}