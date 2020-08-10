package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    Button add_btn,min_btn,multi_btn,divi_btn;
    TextView answer;
    EditText num3,num4;
    String number3, number4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        answer = findViewById(R.id.textView5);
        add_btn = findViewById(R.id.add_button);
        min_btn  =findViewById(R.id.minus_button);
        multi_btn  = findViewById(R.id.multi_button);
        divi_btn = findViewById(R.id.divide_button);
        num3 = findViewById(R.id.number03);
        num4  =findViewById(R.id.number04);

        number3 = getIntent().getExtras().getString("Value1");
        number4 = getIntent().getExtras().getString("Value2");

        num3.setText(number3);
        num4.setText(number4);

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num3.getText().toString().equals("") || num4.getText().toString().equals("")){
                    Toast.makeText(SecondActivity.this,"Please Enter Numbers",Toast.LENGTH_SHORT).show();
                }
                else {
                    num3.getText().toString();
                    num4.getText().toString();
                    int no1 = Integer.valueOf(num3.getText().toString());
                    int no2 = Integer.valueOf(num4.getText().toString());
                    int no3;
                    no3 = no1+no2;
                    answer.setText(String.valueOf(no3));
                }
            }
        });

        min_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num3.getText().toString().equals("") || num4.getText().toString().equals("")){
                    Toast.makeText(SecondActivity.this,"Please Enter Numbers",Toast.LENGTH_SHORT).show();
                }
                else {
                    num3.getText().toString();
                    num4.getText().toString();
                    int no1 = Integer.valueOf(num3.getText().toString());
                    int no2 = Integer.valueOf(num4.getText().toString());
                    int no3;
                    if(no1>no2){
                        no3 = no1 - no2;
                    }
                    else{
                        no3 = no2 - no1;
                    }

                    answer.setText(String.valueOf(no3));
                }
            }
        });

        multi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num3.getText().toString().equals("") || num4.getText().toString().equals("")){
                    Toast.makeText(SecondActivity.this,"Please Enter Numbers",Toast.LENGTH_SHORT).show();
                }
                else {
                    num3.getText().toString();
                    num4.getText().toString();
                    int no1 = Integer.valueOf(num3.getText().toString());
                    int no2 = Integer.valueOf(num4.getText().toString());
                    int no3;
                    no3 = no1*no2;
                    answer.setText(String.valueOf(no3));
                }
            }
        });

        divi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num3.getText().toString().equals("") || num4.getText().toString().equals("")){
                    Toast.makeText(SecondActivity.this,"Please Enter Numbers",Toast.LENGTH_SHORT).show();
                }
                else {
                    num3.getText().toString();
                    num4.getText().toString();
                    int no1 = Integer.valueOf(num3.getText().toString());
                    int no2 = Integer.valueOf(num4.getText().toString());
                    int no3;
                    no3 = no1/no2;
                    answer.setText(String.valueOf(no3));
                }
            }
        });

    }
}