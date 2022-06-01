package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class teams extends AppCompatActivity {
    private Button buttonhomepage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams);
        buttonhomepage = (Button) findViewById(R.id.buttonhomepage1);
        buttonhomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openaguestmenu();
            }

        });

    }
    public void openaguestmenu() {
        Intent intent = new Intent(this, guestmenu.class);
        startActivity(intent);
    }
}