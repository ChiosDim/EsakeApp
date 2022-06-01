package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class livematches extends AppCompatActivity {
    private Button buttonhomepage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livematches);
        buttonhomepage2 = (Button) findViewById(R.id.buttonhomepage2);
        buttonhomepage2.setOnClickListener(new View.OnClickListener() {
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