package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class adminmenu extends AppCompatActivity {

    private Button buttonadminteam;
    private Button buttonadmimatches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminmenu);
        buttonadminteam = (Button) findViewById(R.id.buttonadminteam);
        buttonadminteam.setVisibility(View.VISIBLE);
        buttonadminteam.setBackgroundColor(Color.TRANSPARENT);
        buttonadmimatches= (Button) findViewById(R.id.buttonadminmatches);
        buttonadmimatches.setVisibility(View.VISIBLE);
        buttonadmimatches.setBackgroundColor(Color.TRANSPARENT);
        buttonadminteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openadminteam();
            }

        });
        buttonadmimatches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openadminmatches();
            }

        });
    }
    public void openadminteam() {
        Intent intent = new Intent(this, adminteam.class);
        startActivity(intent);
    }
    public void openadminmatches() {
        Intent intent = new Intent(this, adminmatches.class);
        startActivity(intent);
    }
    }
