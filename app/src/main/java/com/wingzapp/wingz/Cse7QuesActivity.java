package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeCse.BeCse7_aca;
import com.wingzapp.wingz.BeCse.BeCse7_bdabi;
import com.wingzapp.wingz.BeCse.BeCse7_cg;
import com.wingzapp.wingz.BeCse.BeCse7_dwm;
import com.wingzapp.wingz.BeCse.BeCse7_lp;
import com.wingzapp.wingz.BeCse.BeCse7_mc;
import com.wingzapp.wingz.BeCse.BeCse7_mt;
import com.wingzapp.wingz.BeCse.BeCse7_pna;
import com.wingzapp.wingz.BeCse.BeCse7_rtos;
import com.wingzapp.wingz.BeCse.BeCse7_sa;
import com.wingzapp.wingz.BeCse.BeCse7_tcpip;

public class Cse7QuesActivity extends AppCompatActivity {

    Button aca,bdabi,cg,dwm,lp,mc,mt,pna,rtos,sa,tcpip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse7_ques);

        aca= findViewById(R.id.aca);
        bdabi= findViewById(R.id.babi);
        cg= findViewById(R.id.cg);
        dwm= findViewById(R.id.dwm);
        lp= findViewById(R.id.lp);
        mc= findViewById(R.id.mc);
        mt= findViewById(R.id.mft);
        pna= findViewById(R.id.pna);
        rtos= findViewById(R.id.rtos);
        sa= findViewById(R.id.sa);
        tcpip= findViewById(R.id.tcpnip);

        aca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse7QuesActivity.this, BeCse7_aca.class);
                startActivity(intent);
            }
        });
        bdabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse7QuesActivity.this, BeCse7_bdabi.class);
                startActivity(intent);
            }
        });
        cg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse7QuesActivity.this, BeCse7_cg.class);
                startActivity(intent);
            }
        });
        dwm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse7QuesActivity.this, BeCse7_dwm.class);
                startActivity(intent);
            }
        });
        lp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse7QuesActivity.this, BeCse7_lp.class);
                startActivity(intent);
            }
        });
        mt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse7QuesActivity.this, BeCse7_mt.class);
                startActivity(intent);
            }
        });
        mc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse7QuesActivity.this, BeCse7_mc.class);
                startActivity(intent);
            }
        });
        pna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse7QuesActivity.this, BeCse7_pna.class);
                startActivity(intent);
            }
        });
        rtos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse7QuesActivity.this, BeCse7_rtos.class);
                startActivity(intent);
            }
        });
        sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse7QuesActivity.this, BeCse7_sa.class);
                startActivity(intent);
            }
        });
        tcpip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse7QuesActivity.this, BeCse7_tcpip.class);
                startActivity(intent);
            }
        });
    }
}
