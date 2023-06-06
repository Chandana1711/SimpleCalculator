package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNumber1,etNumber2;
    Button btnAdd,btnSub,btnMult,btnDiv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber1=findViewById(R.id.etNumber1);
        etNumber2=findViewById(R.id.etNumber2);
        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMult=findViewById(R.id.btnMult);
        btnDiv=findViewById(R.id.btnDiv);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int Number1 = Integer.parseInt(etNumber1.getText().toString());
                int Number2 = Integer.parseInt(etNumber2.getText().toString());
                Intent intent1 = new Intent(MainActivity.this, com.example.simplecalculator.Activity2.class);
                intent1.putExtra("number1", Number1);
                intent1.putExtra("number2", Number2);
                startActivity(intent1);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Number1=Integer.parseInt(etNumber1.getText().toString());
                int Number2=Integer.parseInt(etNumber2.getText().toString());
                Intent intent2= new Intent(MainActivity.this, com.example.simplecalculator.Activity3.class);
               intent2.putExtra("number1",Number1);
               intent2.putExtra("number2",Number2);
               startActivity(intent2);

            }
        });

        btnMult.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick (View view){
                int Number1 = Integer.parseInt(etNumber1.getText().toString());
                int Number2 = Integer.parseInt(etNumber2.getText().toString());
                Intent intent3 = new Intent(MainActivity.this, com.example.simplecalculator.Activity4.class);
                intent3.putExtra("number1", Number1);
                intent3.putExtra("number2", Number2);
                startActivity(intent3);
            }
            });

        btnDiv.setOnClickListener(new View.OnClickListener()

      {
        @Override
        public void onClick (View v){
        double Number1 = Double.parseDouble(etNumber1.getText().toString());
        double Number2 = Double.parseDouble(etNumber2.getText().toString());
        Intent intent4 = new Intent(MainActivity.this, com.example.simplecalculator.Activity5.class);
        intent4.putExtra("number1", Number1);
        intent4.putExtra("number2", Number2);
        startActivity(intent4);
    }
        });
    }
}