package com.example.kendallproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Adding extends AppCompatActivity {

    private Button goBack;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding);

        goBack = (Button) findViewById(R.id.button4);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBackToOptions();
            }
        });

    }

    public void goBackToOptions() {
        Intent intent2 = new Intent(this, SorA.class);
        startActivity(intent2);
    }
}