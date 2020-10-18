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
import com.wingzapp.wingz.BeExtc.BeExtc4_Dcfm;
import com.wingzapp.wingz.BeExtc.BeExtc4_Emf;
import com.wingzapp.wingz.BeExtc.BeExtc4_M4;
import com.wingzapp.wingz.BeExtc.BeExtc4_Pdm;
import com.wingzapp.wingz.BeExtc.BeExtc4_Ss;

public class Extc4QuesActivity extends AppCompatActivity {
    Button dcfm,emf,m4,pdm,ss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extc4_ques);

        dcfm=findViewById(R.id.dcfm);
        emf=findViewById(R.id.emf);
        m4=findViewById(R.id.m4);
        pdm=findViewById(R.id.pdm);
        ss=findViewById(R.id.ss);

        dcfm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc4QuesActivity.this, BeExtc4_Dcfm.class);
                startActivity(intent);
            }
        });
        emf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc4QuesActivity.this, BeExtc4_Emf.class);
                startActivity(intent);
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc4QuesActivity.this, BeExtc4_M4.class);
                startActivity(intent);
            }
        });
        pdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc4QuesActivity.this, BeExtc4_Pdm.class);
                startActivity(intent);
            }
        });
        ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc4QuesActivity.this, BeExtc4_Ss.class);
                startActivity(intent);
            }
        });
    }
}
