package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeCse.BeCse4_dmgt;
import com.wingzapp.wingz.BeCse.BeCse4_dspd;
import com.wingzapp.wingz.BeCse.BeCse4_os;
import com.wingzapp.wingz.BeCse.BeCse4_sp;
import com.wingzapp.wingz.BeCse.BeCse4_tfcs;

public class Cse4QuesActivity extends AppCompatActivity {
    Button dmgt,dspd,os,sp,tfcs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse4_ques);

        dmgt =findViewById(R.id.dmgt);
        dspd = findViewById(R.id.dspd);
        os =findViewById(R.id.os);
        sp = findViewById(R.id.sp);
        tfcs = findViewById(R.id.tfcs);

        dmgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse4QuesActivity.this,BeCse4_dmgt.class);
                startActivity(intent);
            }
        });
        dspd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse4QuesActivity.this, BeCse4_dspd.class);
                startActivity(intent);
            }
        });
        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse4QuesActivity.this, BeCse4_os.class);
                startActivity(intent);
            }
        });
        sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse4QuesActivity.this, BeCse4_sp.class);
                startActivity(intent);
            }
        });
        tfcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse4QuesActivity.this, BeCse4_tfcs.class);
                startActivity(intent);
            }
        });


    }
}
