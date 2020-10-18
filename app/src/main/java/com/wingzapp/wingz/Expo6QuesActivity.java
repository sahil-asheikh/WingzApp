package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeExpo.BeExpo6_cs1;
import com.wingzapp.wingz.BeExpo.BeExpo6_edtc;
import com.wingzapp.wingz.BeExpo.BeExpo6_eeim;
import com.wingzapp.wingz.BeExpo.BeExpo6_fe;
import com.wingzapp.wingz.BeExpo.BeExpo6_pe;
import com.wingzapp.wingz.BeExpo.BeExpo6_psp;

public class Expo6QuesActivity extends AppCompatActivity {
Button  cs1,edtc,eeim,fe,pe,psp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expo6_ques);

        cs1 = findViewById(R.id.cs1);
        edtc = findViewById(R.id.edtc);
        eeim = findViewById(R.id.eeim);
        fe = findViewById(R.id.fe);
        pe = findViewById(R.id.pe);
        psp = findViewById(R.id.psp);

        cs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo6QuesActivity.this, BeExpo6_cs1.class);
                startActivity(intent);
            }
        });
        edtc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo6QuesActivity.this, BeExpo6_edtc.class);
                startActivity(intent);
            }
        });
        eeim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo6QuesActivity.this, BeExpo6_eeim.class);
                startActivity(intent);
            }
        });
        fe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo6QuesActivity.this, BeExpo6_fe.class);
                startActivity(intent);
            }
        });
        pe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo6QuesActivity.this, BeExpo6_pe.class);
                startActivity(intent);
            }
        });
        psp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo6QuesActivity.this, BeExpo6_psp.class);
                startActivity(intent);
            }
        });

    }
}
