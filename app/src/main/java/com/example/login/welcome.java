package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcome extends AppCompatActivity {
    private Button buttonback2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        buttonback2 = (Button) findViewById(R.id.buttonback2);
        buttonback2.setVisibility(View.VISIBLE);
        buttonback2.setBackgroundColor(Color.TRANSPARENT);
        buttonback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openadminmenu();
            }

        });
    }
    public void openadminmenu() {
        Intent intent = new Intent(this, adminmenu.class);
        startActivity(intent);
    }
}