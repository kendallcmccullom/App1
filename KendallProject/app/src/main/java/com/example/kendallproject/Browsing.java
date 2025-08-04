package com.example.kendallproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.io.File;

public class Browsing extends AppCompatActivity {

    private Button goBack;
    private Button baaaa;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browsing);
        goBack = (Button) findViewById(R.id.button4);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBackToOptions();
            }
        });

        baaaa = (Button) findViewById(R.id.buttonA);
        baaaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAccounting();
            }
        });

    }

    public void goBackToOptions() {
        Intent intent2 = new Intent(this, SorA.class);
        startActivity(intent2);
    }

    public void openAccounting(){
        Intent intent5 = new Intent (this, Accounting.class);
        startActivity(intent5);
    }}