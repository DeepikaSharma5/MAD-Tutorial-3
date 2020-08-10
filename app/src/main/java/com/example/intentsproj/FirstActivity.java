package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button okButton;
    EditText num1, num2;
    String number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        okButton = findViewById(R.id.ok_button);
        num1 = findViewById(R.id.number01);
        num2 = findViewById(R.id.number02);

        LayoutInflater la = getLayoutInflater();
        View layout = la.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);
        toast.show();

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext(); //The context to use. Usually your Application or Activity object
                CharSequence message = "You just clicked the OK button";//Display string
                int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();

                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                number1 = num1.getText().toString();
                number2 = num2.getText().toString();
                intent.putExtra("Value1",number1);
                intent.putExtra("Value2",number2);
                startActivity(intent);
            }
        });


    }
}