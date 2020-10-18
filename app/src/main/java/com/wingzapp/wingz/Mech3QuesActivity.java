package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeMech.BeMech3_em;
import com.wingzapp.wingz.BeMech.BeMech3_fm;
import com.wingzapp.wingz.BeMech.BeMech3_kom;
import com.wingzapp.wingz.BeMech.BeMech3_m3;
import com.wingzapp.wingz.BeMech.BeMech3_mp;

public class Mech3QuesActivity extends AppCompatActivity {
    Button m3,em,fm,kom,mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mech3_ques);

        m3 = findViewById(R.id.m3);
        em = findViewById(R.id.em);
        fm = findViewById(R.id.fm);
        kom = findViewById(R.id.kom);
        mp = findViewById(R.id.mp);

        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech3QuesActivity.this, BeMech3_m3.class);
                startActivity(intent);
            }
        });
        em.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech3QuesActivity.this, BeMech3_em.class);
                startActivity(intent);
            }
        });
        fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech3QuesActivity.this, BeMech3_fm.class);
                startActivity(intent);
            }
        });
        kom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech3QuesActivity.this, BeMech3_kom.class);
                startActivity(intent);
            }
        });
        mp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech3QuesActivity.this, BeMech3_mp.class);
                startActivity(intent);
            }
        });
    }
}
