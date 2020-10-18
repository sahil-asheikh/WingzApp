package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeExtc.BeExtc6_Cse;
import com.wingzapp.wingz.BeExtc.BeExtc6_Dc;
import com.wingzapp.wingz.BeExtc.BeExtc6_Dsp;
import com.wingzapp.wingz.BeExtc.BeExtc6_Fe;
import com.wingzapp.wingz.BeExtc.BeExtc8_Ai;
import com.wingzapp.wingz.BeExtc.BeExtc8_Ccn;
import com.wingzapp.wingz.BeExtc.BeExtc8_Cmos;
import com.wingzapp.wingz.BeExtc.BeExtc8_Dip;
import com.wingzapp.wingz.BeExtc.BeExtc8_Es;
import com.wingzapp.wingz.BeExtc.BeExtc8_Mre;
import com.wingzapp.wingz.BeExtc.BeExtc8_Raa;
import com.wingzapp.wingz.BeExtc.BeExtc8_Rst;
import com.wingzapp.wingz.BeExtc.BeExtc8_Sc;
import com.wingzapp.wingz.BeExtc.BeExtc8_Wsn;

public class Extc8QuesActivity extends AppCompatActivity {
    Button ai,ccn,cmos,dip,es,mre,raa,rst,sc,wsn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extc8_ques);

        ai=findViewById(R.id.ai);
        ccn=findViewById(R.id.ccn);
        cmos=findViewById(R.id.cmos);
        dip=findViewById(R.id.es);
        es=findViewById(R.id.es);
        mre=findViewById(R.id.mre);
        raa=findViewById(R.id.raa);
        rst=findViewById(R.id.rst);
        sc=findViewById(R.id.sc);
        wsn=findViewById(R.id.wmc);

        ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc8QuesActivity.this, BeExtc8_Ai.class);
                startActivity(intent);
            }
        });
        ccn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc8QuesActivity.this, BeExtc8_Ccn.class);
                startActivity(intent);
            }
        });
        cmos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc8QuesActivity.this, BeExtc8_Cmos.class);
                startActivity(intent);
            }
        });
        dip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc8QuesActivity.this, BeExtc8_Dip.class);
                startActivity(intent);
            }
        });
        es.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc8QuesActivity.this, BeExtc8_Es.class);
                startActivity(intent);
            }
        });
        mre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc8QuesActivity.this, BeExtc8_Mre.class);
                startActivity(intent);
            }
        });
        raa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc8QuesActivity.this, BeExtc8_Raa.class);
                startActivity(intent);
            }
        });
        rst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc8QuesActivity.this, BeExtc8_Rst.class);
                startActivity(intent);
            }
        });
        sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc8QuesActivity.this, BeExtc8_Sc.class);
                startActivity(intent);
            }
        });
        wsn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc8QuesActivity.this, BeExtc8_Wsn.class);
                startActivity(intent);
            }
        });
    }
}
