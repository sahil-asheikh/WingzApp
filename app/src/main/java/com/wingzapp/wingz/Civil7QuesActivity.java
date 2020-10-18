package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeCivil.BeCivil7_Acm;
import com.wingzapp.wingz.BeCivil.BeCivil7_Acs;
import com.wingzapp.wingz.BeCivil.BeCivil7_Ah;
import com.wingzapp.wingz.BeCivil.BeCivil7_Apswm;
import com.wingzapp.wingz.BeCivil.BeCivil7_Ate;
import com.wingzapp.wingz.BeCivil.BeCivil7_Bs;
import com.wingzapp.wingz.BeCivil.BeCivil7_Erds;
import com.wingzapp.wingz.BeCivil.BeCivil7_Srm;
import com.wingzapp.wingz.BeCivil.BeCivil7_Te2;
import com.wingzapp.wingz.BeCivil.BeCivil7_cml;
import com.wingzapp.wingz.BeCivil.BeCivil7_enc;
import com.wingzapp.wingz.BeCse.BeCse3_Cao;
import com.wingzapp.wingz.BeCse.BeCse3_M3;
import com.wingzapp.wingz.BeCse.BeCse3_acpld;
import com.wingzapp.wingz.BeCse.BeCse3_dcfm;
import com.wingzapp.wingz.BeCse.BeCse3_eit;

public class Civil7QuesActivity extends AppCompatActivity {
    Button acm,acs,ah,apswm,ate,bs,cml,enc,erds,srm,te2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil7_ques);

        acm=findViewById(R.id.acm);
        acs=findViewById(R.id.acs);
        ah=findViewById(R.id.ah);
        apswm=findViewById(R.id.apswm);
        ate=findViewById(R.id.ate);
        bs=findViewById(R.id.bs);
        cml=findViewById(R.id.cml);
        enc=findViewById(R.id.enc);
        erds=findViewById(R.id.erds);
        srm=findViewById(R.id.srm);
        te2=findViewById(R.id.te2);

        acm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil7QuesActivity.this, BeCivil7_Acm.class);
                startActivity(intent);
            }
        });
        acs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil7QuesActivity.this, BeCivil7_Acs.class);
                startActivity(intent);
            }
        });
        ah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil7QuesActivity.this, BeCivil7_Ah.class);
                startActivity(intent);
            }
        });
        apswm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil7QuesActivity.this, BeCivil7_Apswm.class);
                startActivity(intent);
            }
        });
        ate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil7QuesActivity.this, BeCivil7_Ate.class);
                startActivity(intent);
            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil7QuesActivity.this, BeCivil7_Bs.class);
                startActivity(intent);
            }
        });
        cml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil7QuesActivity.this, BeCivil7_cml.class);
                startActivity(intent);
            }
        });
        enc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil7QuesActivity.this, BeCivil7_enc.class);
                startActivity(intent);
            }
        });
        erds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil7QuesActivity.this, BeCivil7_Erds.class);
                startActivity(intent);
            }
        });
        srm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil7QuesActivity.this, BeCivil7_Srm.class);
                startActivity(intent);
            }
        });
        te2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil7QuesActivity.this, BeCivil7_Te2.class);
                startActivity(intent);
            }
        });
    }
}
