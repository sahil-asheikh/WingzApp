package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeMech.BeMech5_app;
import com.wingzapp.wingz.BeMech.BeMech5_dme;
import com.wingzapp.wingz.BeMech.BeMech5_ht;
import com.wingzapp.wingz.BeMech.BeMech5_ieed;
import com.wingzapp.wingz.BeMech.BeMech5_mmm;

public class Mech5QuesActivity extends AppCompatActivity {
    Button dme,app,ht,ieed,mmm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mech5_ques);

        dme = findViewById(R.id.dme);
        app = findViewById(R.id.app);
        ht = findViewById(R.id.ht);
        ieed = findViewById(R.id.ieed);
        mmm = findViewById(R.id.mmm);

        dme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech5QuesActivity.this, BeMech5_dme.class);
                startActivity(intent);
            }
        });
        app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech5QuesActivity.this, BeMech5_app.class);
                startActivity(intent);
            }
        });
        ht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech5QuesActivity.this, BeMech5_ht.class);
                startActivity(intent);
            }
        });
        ieed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech5QuesActivity.this, BeMech5_ieed.class);
                startActivity(intent);
            }
        });
        mmm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech5QuesActivity.this, BeMech5_mmm.class);
                startActivity(intent);
            }
        });
    }
}
