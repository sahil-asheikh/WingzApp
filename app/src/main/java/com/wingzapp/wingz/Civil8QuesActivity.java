package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeCivil.BeCivil8_Act;
import com.wingzapp.wingz.BeCivil.BeCivil8_Aeg;
import com.wingzapp.wingz.BeCivil.BeCivil8_Age;
import com.wingzapp.wingz.BeCivil.BeCivil8_Arccd;
import com.wingzapp.wingz.BeCivil.BeCivil8_Asa;
import com.wingzapp.wingz.BeCivil.BeCivil8_Asd;
import com.wingzapp.wingz.BeCivil.BeCivil8_Cef;
import com.wingzapp.wingz.BeCivil.BeCivil8_Drmt;
import com.wingzapp.wingz.BeCivil.BeCivil8_Ems;
import com.wingzapp.wingz.BeCivil.BeCivil8_Fce;
import com.wingzapp.wingz.BeCivil.BeCivil8_Gigit;
import com.wingzapp.wingz.BeCivil.BeCivil8_Gis;
import com.wingzapp.wingz.BeCivil.BeCivil8_Ie;
import com.wingzapp.wingz.BeCivil.BeCivil8_Pad;
import com.wingzapp.wingz.BeCivil.BeCivil8_Psc;
import com.wingzapp.wingz.BeCivil.BeCivil8_Wm;
import com.wingzapp.wingz.BeCivil.BeCivil8_Wpe;
import com.wingzapp.wingz.BeCivil.BeCivil8_Wtds;
import com.wingzapp.wingz.BeCivil.BeCivil8_Wwwt;
import com.wingzapp.wingz.BeCse.BeCse3_Cao;
import com.wingzapp.wingz.BeCse.BeCse3_M3;
import com.wingzapp.wingz.BeCse.BeCse3_acpld;
import com.wingzapp.wingz.BeCse.BeCse3_dcfm;
import com.wingzapp.wingz.BeCse.BeCse3_eit;

public class Civil8QuesActivity extends AppCompatActivity {
    Button act,aeg,age,arccd,asa,asd,cef,drmt,ems,fce,gigit,gis,ie,pad,psc,wm,wpe,wtds,wwwt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil8_ques);

        act=findViewById(R.id.act);
        aeg=findViewById(R.id.aeg);
        age=findViewById(R.id.age);
        arccd=findViewById(R.id.arccd);
        asa=findViewById(R.id.asa);
        asd=findViewById(R.id.asd);
        cef=findViewById(R.id.cef);
        drmt=findViewById(R.id.drmt);
        ems=findViewById(R.id.ems);
        fce=findViewById(R.id.fce);
        gigit=findViewById(R.id.gigit);
        gis=findViewById(R.id.gis);
        ie=findViewById(R.id.ie);
        pad=findViewById(R.id.pad);
        psc=findViewById(R.id.psc);
        wm=findViewById(R.id.wm);
        wpe=findViewById(R.id.wpe);
        wtds=findViewById(R.id.wtds);
        wwwt=findViewById(R.id.wwwt);

        act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil8QuesActivity.this, BeCivil8_Act.class);
                startActivity(intent);
            }
        });
        aeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil8QuesActivity.this, BeCivil8_Aeg.class);
                startActivity(intent);
            }
        });
        age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil8QuesActivity.this, BeCivil8_Age.class);
                startActivity(intent);
            }
        });
        arccd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil8QuesActivity.this, BeCivil8_Arccd.class);
                startActivity(intent);
            }
        });
        asa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil8QuesActivity.this, BeCivil8_Asa.class);
                startActivity(intent);
            }
        });
        asd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil8QuesActivity.this, BeCivil8_Asd.class);
                startActivity(intent);
            }
        });
        cef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil8QuesActivity.this, BeCivil8_Cef.class);
                startActivity(intent);
            }
        });
        drmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil8QuesActivity.this, BeCivil8_Drmt.class);
                startActivity(intent);
            }
        });
        ems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil8QuesActivity.this, BeCivil8_Ems.class);
                startActivity(intent);
            }
        });
        fce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil8QuesActivity.this, BeCivil8_Fce.class);
                startActivity(intent);
            }
        });
        gigit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil8QuesActivity.this, BeCivil8_Gigit.class);
                startActivity(intent);
            }
        });
        gis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil8QuesActivity.this, BeCivil8_Gis.class);
                startActivity(intent);
            }
        });
        ie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil8QuesActivity.this, BeCivil8_Ie.class);
                startActivity(intent);
            }
        });
        pad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil8QuesActivity.this, BeCivil8_Pad.class);
                startActivity(intent);
            }
        });
        psc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil8QuesActivity.this, BeCivil8_Psc.class);
                startActivity(intent);
            }
        });
        wm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil8QuesActivity.this, BeCivil8_Wm.class);
                startActivity(intent);
            }
        });
        wpe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil8QuesActivity.this, BeCivil8_Wpe.class);
                startActivity(intent);
            }
        });
        wtds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil8QuesActivity.this, BeCivil8_Wtds.class);
                startActivity(intent);
            }
        });
        wwwt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil8QuesActivity.this, BeCivil8_Wwwt.class);
                startActivity(intent);
            }
        });

    }
}
