package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        TextView k = (TextView)findViewById(R.id.textView7);
        Intent intent = getIntent();
        String user_name = intent.getStringExtra("USER_NAME");
        k.setText(user_name);

        double bmi= Double.parseDouble(user_name) ;
        TextView ans = (TextView)findViewById(R.id.textView9);
        if(18.5 > bmi){
            ans.setTextColor(Color.parseColor("#F44336"));
            ans.setText("體重太輕要吃多點喔");}
        else if (24 < bmi){
            ans.setTextColor(Color.parseColor("#F44336"));
            ans.setText("體重太重囉");}
        else{
            ans.setTextColor(Color.parseColor("#93C35C"));
            ans.setText("體重正常繼續保持");}



        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(page2.this, page1.class);
                startActivity(intent);
            }
        });
    }
}