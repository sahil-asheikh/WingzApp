package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CseQuesPprActivity extends AppCompatActivity {
    Button sem3,sem4,sem5,sem6,sem7,sem8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_ques_ppr);
        sem3 = (Button)findViewById(R.id.sem3);
        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CseQuesPprActivity.this, Cse3QuesActivity.class);
                startActivity(intent);
            }
        });
        sem4 = (Button)findViewById(R.id.sem4);
        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CseQuesPprActivity.this, Cse4QuesActivity.class);
                startActivity(intent);
            }
        });
        sem5 = (Button)findViewById(R.id.sem5);
        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CseQuesPprActivity.this, Cse5QuesActivity.class);
                startActivity(intent);
            }
        });
        sem6 = (Button)findViewById(R.id.sem6);
        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CseQuesPprActivity.this, Cse6QuesActivity.class);
                startActivity(intent);
            }
        });
        sem7 = (Button)findViewById(R.id.sem7);
        sem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CseQuesPprActivity.this, Cse7QuesActivity.class);
                startActivity(intent);
            }
        });
        sem8 = (Button)findViewById(R.id.sem8);
        sem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CseQuesPprActivity.this, Cse8QuesActivity.class);
                startActivity(intent);
            }
        });
    }
}
