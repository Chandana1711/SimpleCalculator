package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView tvResults2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tvResults2=findViewById(R.id.tvResults2);

        int Number1=getIntent().getIntExtra("number1",0);
        int Number2=getIntent().getIntExtra("number2",0);
        int sum= Number1+Number2;
        tvResults2.setText(String.valueOf(sum));

    }
}