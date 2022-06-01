package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class admin extends AppCompatActivity {

    private ImageButton imagebutton;
    private ImageButton imagebutton2;
    String password;

    EditText passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        imagebutton2 = (ImageButton) findViewById(R.id.imageButton2);
        imagebutton = (ImageButton) findViewById(R.id.imageButton);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
                password = passwordInput.getText().toString();

                showToast(password);
            }

        });
        imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openwelcome();

            }

        });


    }

    private void showToast(String text){
        Toast.makeText(admin.this , text, Toast.LENGTH_SHORT).show();
}

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openwelcome() {
        Intent intent = new Intent(this, welcome.class);
        startActivity(intent);
    }
}