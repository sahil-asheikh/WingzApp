package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExpoQuesPprActivity extends AppCompatActivity {
    Button sem3,sem4,sem5,sem6,sem7,sem8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expo_ques_ppr);
        sem3 = findViewById(R.id.sem3);
        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExpoQuesPprActivity.this, Expo3QuesActivity.class);
                startActivity(intent);
            }
        });
        sem4 = findViewById(R.id.sem4);
        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExpoQuesPprActivity.this, Expo4QuesActivity.class);
                startActivity(intent);
            }
        });
        sem5 = findViewById(R.id.sem5);
        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExpoQuesPprActivity.this, Expo5QuesActivity.class);
                startActivity(intent);
            }
        });
        sem6 = findViewById(R.id.sem6);
        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExpoQuesPprActivity.this, Expo6QuesActivity.class);
                startActivity(intent);
            }
        });
        sem7 = findViewById(R.id.sem7);
        sem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExpoQuesPprActivity.this, expo7QuesActivity.class);
                startActivity(intent);
            }
        });
        sem8 = findViewById(R.id.sem8);
        sem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExpoQuesPprActivity.this, Expo8QuesActivity.class);
                startActivity(intent);
            }
        });
    }
}
