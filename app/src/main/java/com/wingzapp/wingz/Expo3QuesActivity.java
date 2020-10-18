package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeExpo.BeExpo3_edc;
import com.wingzapp.wingz.BeExpo.BeExpo3_emi;
import com.wingzapp.wingz.BeExpo.BeExpo3_m3;
import com.wingzapp.wingz.BeExpo.BeExpo3_na;
import com.wingzapp.wingz.BeExpo.BeExpo3_nces;

public class Expo3QuesActivity extends AppCompatActivity {
    Button m3,emi,edc,na,nces;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expo3_ques);

        m3 = findViewById(R.id.m3);
        emi = findViewById(R.id.emi);
        edc = findViewById(R.id.edc);
        na = findViewById(R.id.na);
        nces = findViewById(R.id.nces);

        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Expo3QuesActivity.this, BeExpo3_m3.class);
                startActivity(intent);
            }
        });
        nces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Expo3QuesActivity.this, BeExpo3_nces.class);
                startActivity(intent);
            }
        });
        na.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Expo3QuesActivity.this, BeExpo3_na.class);
                startActivity(intent);
            }
        });
        emi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Expo3QuesActivity.this, BeExpo3_emi.class);
                startActivity(intent);
            }
        });
        edc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Expo3QuesActivity.this, BeExpo3_edc.class);
                startActivity(intent);
            }
        });
    }
}
