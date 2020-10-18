package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeCse.BeCse3_Cao;
import com.wingzapp.wingz.BeCse.BeCse3_M3;
import com.wingzapp.wingz.BeCse.BeCse3_acpld;
import com.wingzapp.wingz.BeCse.BeCse3_dcfm;
import com.wingzapp.wingz.BeCse.BeCse3_eit;

public class Cse3QuesActivity extends AppCompatActivity {
    Button m3,acpld,cao,eit,dcfm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse3_ques);

        m3= findViewById(R.id.m3);
        acpld = findViewById(R.id.acpld);
        cao = findViewById(R.id.cao);
        eit = findViewById(R.id.eit);
        dcfm = findViewById(R.id.dcfm);

        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse3QuesActivity.this, BeCse3_M3.class);
                startActivity(intent);
            }
        });
        acpld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse3QuesActivity.this, BeCse3_acpld.class);
                startActivity(intent);
            }
        });
        cao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse3QuesActivity.this, BeCse3_Cao.class);
                startActivity(intent);
            }
        });
        eit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse3QuesActivity.this, BeCse3_eit.class);
                startActivity(intent);
            }
        });
        dcfm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse3QuesActivity.this, BeCse3_dcfm.class);
                startActivity(intent);
            }
        });
    }
}
