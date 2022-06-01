package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2 = (Button) findViewById(R.id.button2);
        button1 = (Button) findViewById(R.id.buttonadmin);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openadmin();
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openaguest();
            }

        });
    }


    public void openadmin() {
        Intent intent = new Intent(this, admin.class);
        startActivity(intent);
    }
    public void openaguest() {
        Intent intent = new Intent(this, guest.class);
        startActivity(intent);
    }
}