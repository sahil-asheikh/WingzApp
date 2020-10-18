package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeMech.BeMech7_ae;
import com.wingzapp.wingz.BeMech.BeMech7_cad;
import com.wingzapp.wingz.BeMech.BeMech7_dmd;
import com.wingzapp.wingz.BeMech.BeMech7_ec2;
import com.wingzapp.wingz.BeMech.BeMech7_ie;
import com.wingzapp.wingz.BeMech.BeMech7_ir;
import com.wingzapp.wingz.BeMech.BeMech7_mhs;
import com.wingzapp.wingz.BeMech.BeMech7_ppe;
import com.wingzapp.wingz.BeMech.BeMech7_sm;
import com.wingzapp.wingz.BeMech.BeMech7_td;

public class Mech7QuesActivity extends AppCompatActivity {

    Button ae,cad,dmd,ec2,ie,ir,mhs,ppe,sm,td;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mech7_ques);

        ae = findViewById(R.id.ae);
        cad = findViewById(R.id.cad);
        dmd = findViewById(R.id.dmd);
        ec2 = findViewById(R.id.ec2);
        ie = findViewById(R.id.ie);
        ir = findViewById(R.id.ir);
        mhs = findViewById(R.id.mhs);
        ppe = findViewById(R.id.ppe);
        sm = findViewById(R.id.sm);
        td = findViewById(R.id.td);

        ae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech7QuesActivity.this, BeMech7_ae.class);
                startActivity(intent);
            }
        });
        cad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech7QuesActivity.this, BeMech7_cad.class);
                startActivity(intent);
            }
        });
        dmd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech7QuesActivity.this, BeMech7_dmd.class);
                startActivity(intent);
            }
        });
        ec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech7QuesActivity.this, BeMech7_ec2.class);
                startActivity(intent);
            }
        });
        ie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech7QuesActivity.this, BeMech7_ie.class);
                startActivity(intent);
            }
        });
        ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech7QuesActivity.this, BeMech7_ir.class);
                startActivity(intent);
            }
        });
        mhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech7QuesActivity.this, BeMech7_mhs.class);
                startActivity(intent);
            }
        });
        ppe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech7QuesActivity.this, BeMech7_ppe.class);
                startActivity(intent);
            }
        });
        sm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech7QuesActivity.this, BeMech7_sm.class);
                startActivity(intent);
            }
        });
        td.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech7QuesActivity.this, BeMech7_td.class);
                startActivity(intent);
            }
        });

    }
}
