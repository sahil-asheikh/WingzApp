package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeCse.BeCse5_Dbms;
import com.wingzapp.wingz.BeCse.BeCse5_cg;
import com.wingzapp.wingz.BeCse.BeCse5_daa;
import com.wingzapp.wingz.BeCse.BeCse5_dc;
import com.wingzapp.wingz.BeCse.BeCse5_oop;

public class Cse5QuesActivity extends AppCompatActivity {
    Button cg,daa,dbms,dc,oop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse5_ques);

        cg =findViewById(R.id.cg);
        daa = findViewById(R.id.daa);
        dbms = findViewById(R.id.dbms);
        dc = findViewById(R.id.dc);
        oop = findViewById(R.id.oop);

        cg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse5QuesActivity.this, BeCse5_cg.class);
                startActivity(intent);
            }
        });
        daa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse5QuesActivity.this, BeCse5_daa.class);
                startActivity(intent);
            }
        });
        dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse5QuesActivity.this, BeCse5_Dbms.class);
                startActivity(intent);
            }
        });
        dc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse5QuesActivity.this, BeCse5_dc.class);
                startActivity(intent);
            }
        });
        oop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse5QuesActivity.this, BeCse5_oop.class);
                startActivity(intent);
            }
        });
    }
}
