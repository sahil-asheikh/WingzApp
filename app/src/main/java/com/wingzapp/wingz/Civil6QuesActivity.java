package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeCivil.BeCivil6_Ee2;
import com.wingzapp.wingz.BeCivil.BeCivil6_Fm2;
import com.wingzapp.wingz.BeCivil.BeCivil6_FunctionalEnglish;
import com.wingzapp.wingz.BeCivil.BeCivil6_Ss;
import com.wingzapp.wingz.BeCivil.BeCivil6_Surveying2;
import com.wingzapp.wingz.BeCse.BeCse3_M3;

public class Civil6QuesActivity extends AppCompatActivity {
    Button ee2,fm2,functional_english,ss,surveying2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil6_ques);

        ee2=findViewById(R.id.ee2);
        ee2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil6QuesActivity.this, BeCivil6_Ee2.class);
                startActivity(intent);
            }
        });

        fm2=findViewById(R.id.fm2);
        fm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil6QuesActivity.this, BeCivil6_Fm2.class);
                startActivity(intent);
            }
        });

        functional_english=findViewById(R.id.esp2);
        functional_english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil6QuesActivity.this, BeCivil6_FunctionalEnglish.class);
                startActivity(intent);
            }
        });

        ss=findViewById(R.id.ss);
        ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil6QuesActivity.this, BeCivil6_Ss.class);
                startActivity(intent);
            }
        });

        surveying2=findViewById(R.id.s2);
        surveying2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil6QuesActivity.this, BeCivil6_Surveying2.class);
                startActivity(intent);
            }
        });
    }
}
