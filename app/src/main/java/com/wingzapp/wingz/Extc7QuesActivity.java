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
import com.wingzapp.wingz.BeExtc.BeExtc7_Adsa;
import com.wingzapp.wingz.BeExtc.BeExtc7_Dsp;
import com.wingzapp.wingz.BeExtc.BeExtc7_Encry;
import com.wingzapp.wingz.BeExtc.BeExtc7_Flnn;
import com.wingzapp.wingz.BeExtc.BeExtc7_Mms;
import com.wingzapp.wingz.BeExtc.BeExtc7_Oc;
import com.wingzapp.wingz.BeExtc.BeExtc7_Sp;
import com.wingzapp.wingz.BeExtc.BeExtc7_Tve;

public class Extc7QuesActivity extends AppCompatActivity {
    Button adsa,dsp,encry,flnn,mms,oc,sp,tve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extc7_ques);

        adsa=findViewById(R.id.adsa);
        dsp=findViewById(R.id.dsp);
        encry=findViewById(R.id.dc_encry);
        flnn=findViewById(R.id.flnn);
        mms=findViewById(R.id.mms);
        oc=findViewById(R.id.oc);
        sp=findViewById(R.id.sp);
        tve=findViewById(R.id.tve);

        adsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc7QuesActivity.this, BeExtc7_Adsa.class);
                startActivity(intent);
            }
        });
        dsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc7QuesActivity.this, BeExtc7_Dsp.class);
                startActivity(intent);
            }
        });
        encry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc7QuesActivity.this, BeExtc7_Encry.class);
                startActivity(intent);
            }
        });
        flnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc7QuesActivity.this, BeExtc7_Flnn.class);
                startActivity(intent);
            }
        });
        mms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc7QuesActivity.this, BeExtc7_Mms.class);
                startActivity(intent);
            }
        });
        oc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc7QuesActivity.this, BeExtc7_Oc.class);
                startActivity(intent);
            }
        });
        sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc7QuesActivity.this, BeExtc7_Sp.class);
                startActivity(intent);
            }
        });
        tve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc7QuesActivity.this, BeExtc7_Tve.class);
                startActivity(intent);
            }
        });








    }
}
