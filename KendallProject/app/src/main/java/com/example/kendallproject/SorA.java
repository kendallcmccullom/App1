package com.example.kendallproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SorA extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sor);

        btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSearching();
            }
        });

       btn2 = (Button) findViewById(R.id.button2);
       btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAdding();
            }
        });

       btn3 = (Button) findViewById(R.id.button3);
       btn3.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick (View v) { openBrowsing();}
       });

    }

    public void openSearching() {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }

    public void openAdding() {
        Intent intent3 = new Intent(this, Adding.class);
        startActivity(intent3);
    }

    public void openBrowsing(){
        Intent intent4 = new Intent (this, Browsing.class);
        startActivity(intent4);
    }



}