package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeCivil.BeCivil3_Ct;
import com.wingzapp.wingz.BeCivil.BeCivil3_Ee1;
import com.wingzapp.wingz.BeCivil.BeCivil3_Geology;
import com.wingzapp.wingz.BeCivil.BeCivil3_M3;
import com.wingzapp.wingz.BeCivil.BeCivil3_Som;

public class Civil3QuesActivity extends AppCompatActivity {
    Button ct,m3,geology,ee1,som;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil3_ques);

        m3=findViewById(R.id.m3);

        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil3QuesActivity.this, BeCivil3_M3.class);
                startActivity(intent);
            }
        });

        ct=findViewById(R.id.ct);

        ct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil3QuesActivity.this, BeCivil3_Ct.class);
                startActivity(intent);
            }
        });

        geology=findViewById(R.id.geology);

        geology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil3QuesActivity.this, BeCivil3_Geology.class);
                startActivity(intent);
            }
        });

        ee1=findViewById(R.id.ee1);

        ee1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil3QuesActivity.this, BeCivil3_Ee1.class);
                startActivity(intent);
            }
        });

        som=findViewById(R.id.som);

                som.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Civil3QuesActivity.this, BeCivil3_Som.class);
                        startActivity(intent);
                    }
                });
    }
}
