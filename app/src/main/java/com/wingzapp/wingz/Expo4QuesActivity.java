package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeExpo.BeExpo4_cp;
import com.wingzapp.wingz.BeExpo.BeExpo4_dlec;
import com.wingzapp.wingz.BeExpo.BeExpo4_ee;
import com.wingzapp.wingz.BeExpo.BeExpo4_em1;
import com.wingzapp.wingz.BeExpo.BeExpo4_m4;

public class Expo4QuesActivity extends AppCompatActivity {
Button m4,cp,dlec,ee,em1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expo4_ques);

        m4 = findViewById(R.id.m4);
        cp = findViewById(R.id.cp);
        dlec = findViewById(R.id.dlec);
        ee = findViewById(R.id.ee);
        em1 = findViewById(R.id.em1);

         m4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(Expo4QuesActivity.this, BeExpo4_m4.class);
                 startActivity(intent);
             }
         });
        cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo4QuesActivity.this, BeExpo4_cp.class);
                startActivity(intent);
            }
        });
        dlec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo4QuesActivity.this, BeExpo4_dlec.class);
                startActivity(intent);
            }
        });
        ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo4QuesActivity.this, BeExpo4_ee.class);
                startActivity(intent);
            }
        });
        em1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo4QuesActivity.this, BeExpo4_em1.class);
                startActivity(intent);
            }
        });

    }
}
