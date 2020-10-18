package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeExpo.BeExpo8_ampp;
import com.wingzapp.wingz.BeExpo.BeExpo8_bme;
import com.wingzapp.wingz.BeExpo.BeExpo8_caps;
import com.wingzapp.wingz.BeExpo.BeExpo8_dsp;
import com.wingzapp.wingz.BeExpo.BeExpo8_ed;
import com.wingzapp.wingz.BeExpo.BeExpo8_eds;
import com.wingzapp.wingz.BeExpo.BeExpo8_ehvac;
import com.wingzapp.wingz.BeExpo.BeExpo8_pq;
import com.wingzapp.wingz.BeExpo.BeExpo8_psbed;
import com.wingzapp.wingz.BeExpo.BeExpo8_sp;

public class Expo8QuesActivity extends AppCompatActivity {
Button ampp,bme,caps,dsp,ed,eds,ehvac,pq,psbed,sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expo8_ques);

        ampp = findViewById(R.id.ampp);
        bme = findViewById(R.id.bme);
        caps = findViewById(R.id.caps);
        dsp = findViewById(R.id.dsd);
        ed = findViewById(R.id.ed);
        eds = findViewById(R.id.eds);
        ehvac = findViewById(R.id.ehvac);
        pq = findViewById(R.id.pq);
        psbed = findViewById(R.id.psbed);
        sp = findViewById(R.id.sp);

        ampp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo8QuesActivity.this, BeExpo8_ampp.class);
                startActivity(intent);
            }
        });
        bme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo8QuesActivity.this, BeExpo8_bme.class);
                startActivity(intent);
            }
        });
        caps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo8QuesActivity.this, BeExpo8_caps.class);
                startActivity(intent);
            }
        });
        dsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo8QuesActivity.this, BeExpo8_dsp.class);
                startActivity(intent);
            }
        });
        ed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo8QuesActivity.this, BeExpo8_ed.class);
                startActivity(intent);
            }
        });
        eds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo8QuesActivity.this, BeExpo8_eds.class);
                startActivity(intent);
            }
        });
        ehvac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo8QuesActivity.this, BeExpo8_ehvac.class);
                startActivity(intent);
            }
        });
        pq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo8QuesActivity.this, BeExpo8_pq.class);
                startActivity(intent);
            }
        });
        psbed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo8QuesActivity.this, BeExpo8_psbed.class);
                startActivity(intent);
            }
        });
        sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo8QuesActivity.this, BeExpo8_sp.class);
                startActivity(intent);
            }
        });

    }
}
