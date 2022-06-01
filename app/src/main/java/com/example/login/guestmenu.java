package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class guestmenu extends AppCompatActivity {
    private Button buttonteams;
    private Button buttonlivematches;
    private Button buttonfinished;
    private Button buttonschedule;
    private Button buttonstandings;
    private Button buttonstatistics;
    private Button buttonbest;
    private Button buttonhelp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);
        buttonteams = (Button) findViewById(R.id.buttonteams);
        buttonteams.setVisibility(View.VISIBLE);
        buttonteams.setBackgroundColor(Color.TRANSPARENT);
        buttonhelp = (Button) findViewById(R.id.buttonhelp);
        buttonhelp.setVisibility(View.VISIBLE);
        buttonhelp.setBackgroundColor(Color.TRANSPARENT);
        buttonbest = (Button) findViewById(R.id.buttonbest);
        buttonbest.setBackgroundColor(Color.TRANSPARENT);
        buttonbest.setVisibility(View.VISIBLE);
        buttonstatistics = (Button) findViewById(R.id.buttonstatistics);
        buttonstatistics.setVisibility(View.VISIBLE);
        buttonstatistics.setBackgroundColor(Color.TRANSPARENT);
        buttonstandings = (Button) findViewById(R.id.buttonstandings);
        buttonstandings.setVisibility(View.VISIBLE);
        buttonstandings.setBackgroundColor(Color.TRANSPARENT);
        buttonfinished = (Button) findViewById(R.id.buttonfinished);
        buttonfinished.setVisibility(View.VISIBLE);
        buttonfinished.setBackgroundColor(Color.TRANSPARENT);
        buttonlivematches = (Button) findViewById(R.id.buttonlivematches);
        buttonlivematches.setVisibility(View.VISIBLE);
        buttonlivematches.setBackgroundColor(Color.TRANSPARENT);
        buttonschedule = (Button) findViewById(R.id.buttonschedule);
        buttonschedule.setVisibility(View.VISIBLE);
        buttonschedule.setBackgroundColor(Color.TRANSPARENT);
        buttonteams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openateams();
            }

        });
        buttonlivematches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openlivematches();
            }

        });
        buttonfinished.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfinishedmatches();
            }

        });
        buttonschedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openschedule();
            }

        });
        buttonstandings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openstandings();
            }

        });
        buttonstatistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openstatistics();
            }

        });
        buttonbest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openbestof();
            }

        });
        buttonhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openhelp();
            }

        });

    }


    public void openateams() {
        Intent intent = new Intent(this, teams.class);
        startActivity(intent);
    }
    public void openlivematches() {
        Intent intent = new Intent(this, livematches.class);
        startActivity(intent);
    }
    public void openschedule() {
        Intent intent = new Intent(this, schedule.class);
        startActivity(intent);
    }
    public void openfinishedmatches() {
        Intent intent = new Intent(this, finishedmatches.class);
        startActivity(intent);
    }
    public void openstandings() {
        Intent intent = new Intent(this, standings.class);
        startActivity(intent);
    }
    public void openstatistics() {
        Intent intent = new Intent(this, statistics.class);
        startActivity(intent);
    }
    public void openbestof() {
        Intent intent = new Intent(this, bestof.class);
        startActivity(intent);
    }
    public void openhelp() {
        Intent intent = new Intent(this, HELP.class);
        startActivity(intent);
    }

}