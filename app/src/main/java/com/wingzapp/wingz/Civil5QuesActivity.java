package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeCivil.BeCivil5_Fm1;
import com.wingzapp.wingz.BeCivil.BeCivil5_Ge2;
import com.wingzapp.wingz.BeCivil.BeCivil5_Hwr;
import com.wingzapp.wingz.BeCivil.BeCivil5_Rccs;
import com.wingzapp.wingz.BeCivil.BeCivil5_Sa2;
import com.wingzapp.wingz.BeCse.BeCse4_dmgt;

public class Civil5QuesActivity extends AppCompatActivity {
    Button fm1,ge2,hwr,rccs,sa2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil5_ques);

        fm1=findViewById(R.id.fm1);
        fm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil5QuesActivity.this, BeCivil5_Fm1.class);
                startActivity(intent);
            }
        });
        ge2=findViewById(R.id.ge2);
        ge2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil5QuesActivity.this, BeCivil5_Ge2.class);
                startActivity(intent);
            }
        });
        hwr=findViewById(R.id.hwr);
        hwr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil5QuesActivity.this, BeCivil5_Hwr.class);
                startActivity(intent);
            }
        });
        rccs=findViewById(R.id.rccs);
        rccs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil5QuesActivity.this, BeCivil5_Rccs.class);
                startActivity(intent);
            }
        });
        sa2=findViewById(R.id.sa2);
        sa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil5QuesActivity.this, BeCivil5_Sa2.class);
                startActivity(intent);
            }
        });
    }
}
