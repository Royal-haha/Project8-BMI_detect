package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class page1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText height = (EditText)findViewById(R.id.editTextNumber2);
                EditText weight = (EditText)findViewById(R.id.editTextNumber3);
                DecimalFormat df = new DecimalFormat("0.0");
                double h = Double.parseDouble(height.getText().toString())/100;
                double w = Double.parseDouble(weight.getText().toString());
                double bmi= w / (h*h);
                Intent intent = new Intent(page1.this, page2.class);
                String user_name = df.format(bmi);
                intent.putExtra("USER_NAME", user_name);
                startActivity(intent);
            }
        });
    }
}