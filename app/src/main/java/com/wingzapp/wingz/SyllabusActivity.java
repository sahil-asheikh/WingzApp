package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SyllabusActivity extends AppCompatActivity {
Button fi,cse,mech,civil,extc,expo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);
        fi = (Button) findViewById(R.id.btn_1year_syll);
        fi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SyllabusActivity.this, Syll1styearActivity.class);
                startActivity(intent);

            }
        });
        cse = (Button) findViewById(R.id.btn_cse_syll);
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SyllabusActivity.this, SyllCseBeActivity.class);
                startActivity(intent);

            }
        });
        mech = (Button) findViewById(R.id.btn_mech_syll);
        mech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SyllabusActivity.this, SyllMechBeActivity.class);
                startActivity(intent);

            }
        });
        civil= (Button) findViewById(R.id.btn_civil_syll);
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SyllabusActivity.this, SyllCivilBeActivity.class);
                startActivity(intent);

            }
        });
        expo = (Button) findViewById(R.id.btn_expo_syll);
        expo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SyllabusActivity.this, SyllExpoBeActivity.class);
                startActivity(intent);

            }
        });
        extc= (Button) findViewById(R.id.btn_extc_syll);
        extc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SyllabusActivity.this, SyllExtcBeActivity.class);
                startActivity(intent);

            }
        });

    }
}
