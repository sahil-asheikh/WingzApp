package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeExpo.BeExpo7_cs2;
import com.wingzapp.wingz.BeExpo.BeExpo7_eid;
import com.wingzapp.wingz.BeExpo.BeExpo7_ema;
import com.wingzapp.wingz.BeExpo.BeExpo7_eps2;
import com.wingzapp.wingz.BeExpo.BeExpo7_facts;
import com.wingzapp.wingz.BeExpo.BeExpo7_flnn;
import com.wingzapp.wingz.BeExpo.BeExpo7_hve;
import com.wingzapp.wingz.BeExpo.BeExpo7_it_app;

public class expo7QuesActivity extends AppCompatActivity {
Button cs2,eid,ema,eps2,facts,flnn,it_app,hve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expo7_ques);

        cs2 = findViewById(R.id.cs2);
        eid = findViewById(R.id.eid);
        ema = findViewById(R.id.ema);
        eps2 = findViewById(R.id.eps2);
        facts = findViewById(R.id.facts);
        flnn = findViewById(R.id.flnn);
        it_app = findViewById(R.id.it_app);
        hve = findViewById(R.id.hve);

        cs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(expo7QuesActivity.this, BeExpo7_cs2.class);
                startActivity(intent);
            }
        });
        eid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(expo7QuesActivity.this, BeExpo7_eid.class);
                startActivity(intent);
            }
        });
        ema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(expo7QuesActivity.this, BeExpo7_ema.class);
                startActivity(intent);
            }
        });
        eps2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(expo7QuesActivity.this, BeExpo7_eps2.class);
                startActivity(intent);
            }
        });
        facts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(expo7QuesActivity.this, BeExpo7_facts.class);
                startActivity(intent);
            }
        });
        flnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(expo7QuesActivity.this, BeExpo7_flnn.class);
                startActivity(intent);
            }
        });
        it_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(expo7QuesActivity.this, BeExpo7_it_app.class);
                startActivity(intent);
            }
        });
        hve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(expo7QuesActivity.this, BeExpo7_hve.class);
                startActivity(intent);
            }
        });
    }
}
