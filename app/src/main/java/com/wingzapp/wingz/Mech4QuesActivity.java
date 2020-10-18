package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeMech.BeMech4_et;
import com.wingzapp.wingz.BeMech.BeMech4_hm;
import com.wingzapp.wingz.BeMech.BeMech4_m4;
import com.wingzapp.wingz.BeMech.BeMech4_mom;
import com.wingzapp.wingz.BeMech.BeMech4_mp;

public class Mech4QuesActivity extends AppCompatActivity {
    Button m4,hm,et,mom,mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mech4_ques);

        m4 = findViewById(R.id.m4);
        hm = findViewById(R.id.hm);
        et = findViewById(R.id.et);
        mom = findViewById(R.id.mom);
        mp = findViewById(R.id.mp);

        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech4QuesActivity.this, BeMech4_m4.class);
                startActivity(intent);
            }
        });
        hm.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(Mech4QuesActivity.this, BeMech4_hm.class);
                 startActivity(intent);
             }
        });
        et.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(Mech4QuesActivity.this, BeMech4_et.class);
                 startActivity(intent);
             }
        });
        mom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech4QuesActivity.this, BeMech4_mom.class);
                startActivity(intent);
            }
        });
        mp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech4QuesActivity.this, BeMech4_mp.class);
                startActivity(intent);
            }
        });
    }
}
