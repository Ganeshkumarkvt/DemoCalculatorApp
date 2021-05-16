package com.ganeshkumarkvt.democalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout Scifi1, Scifi2;
    Button sci1, sci2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        Scifi1 = findViewById(R.id.scifi1);
        Scifi2 = findViewById(R.id.scifi2);
        sci1 = findViewById(R.id.ebtn);
        sci2 = findViewById(R.id.normchn);
        sci1.setOnClickListener(v -> {
            Scifi1.setVisibility(View.VISIBLE);
            Scifi2.setVisibility(View.VISIBLE);
            sci1.setText("e");
        });

        sci2.setOnClickListener(v -> {
            Scifi1.setVisibility(View.GONE);
            Scifi2.setVisibility(View.GONE);
            sci1.setText("Sci");
        });

    }
}