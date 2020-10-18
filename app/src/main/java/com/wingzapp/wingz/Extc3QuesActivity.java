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
import com.wingzapp.wingz.BeExtc.BeExtc3_Edc;
import com.wingzapp.wingz.BeExtc.BeExtc3_Emi;
import com.wingzapp.wingz.BeExtc.BeExtc3_M3;
import com.wingzapp.wingz.BeExtc.BeExtc3_Nans;
import com.wingzapp.wingz.BeExtc.BeExtc3_Oop;

public class Extc3QuesActivity extends AppCompatActivity {
    Button edc,emi,m3,nans,oop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extc3_ques);

        edc=findViewById(R.id.edc);
        emi=findViewById(R.id.emi);
        m3=findViewById(R.id.m3);
        nans=findViewById(R.id.nans);
        oop=findViewById(R.id.oop);

        edc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc3QuesActivity.this, BeExtc3_Edc.class);
                startActivity(intent);
            }
        });
        emi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc3QuesActivity.this, BeExtc3_Emi.class);
                startActivity(intent);
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc3QuesActivity.this, BeExtc3_M3.class);
                startActivity(intent);
            }
        });
        nans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc3QuesActivity.this, BeExtc3_Nans.class);
                startActivity(intent);
            }
        });
        oop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc3QuesActivity.this, BeExtc3_Oop.class);
                startActivity(intent);
            }
        });

    }
}
