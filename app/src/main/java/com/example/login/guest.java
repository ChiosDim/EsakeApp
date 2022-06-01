package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class guest extends AppCompatActivity {
    private Button buttonback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);
        buttonback = (Button) findViewById(R.id.buttonback);
        buttonback.setVisibility(View.VISIBLE);
        buttonback.setBackgroundColor(Color.TRANSPARENT);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openguestmenu();
            }

        });
    }
    public void openguestmenu() {
        Intent intent = new Intent(this, guestmenu.class);
        startActivity(intent);
    }
}