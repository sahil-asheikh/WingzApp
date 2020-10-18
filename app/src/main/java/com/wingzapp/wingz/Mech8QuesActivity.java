package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeMech.BeMech8_aice;
import com.wingzapp.wingz.BeMech.BeMech8_amt;
import com.wingzapp.wingz.BeMech.BeMech8_ap;
import com.wingzapp.wingz.BeMech.BeMech8_cim;
import com.wingzapp.wingz.BeMech.BeMech8_ec3;
import com.wingzapp.wingz.BeMech.BeMech8_fem;
import com.wingzapp.wingz.BeMech.BeMech8_ifp;
import com.wingzapp.wingz.BeMech.BeMech8_im;
import com.wingzapp.wingz.BeMech.BeMech8_mis;
import com.wingzapp.wingz.BeMech.BeMech8_mtd;
import com.wingzapp.wingz.BeMech.BeMech8_mv;
import com.wingzapp.wingz.BeMech.BeMech8_rac;
import com.wingzapp.wingz.BeMech.BeMech8_res;
import com.wingzapp.wingz.BeMech.BeMech8_sa;

public class Mech8QuesActivity extends AppCompatActivity {
    Button aice,amt,ap,cim,ec3,fem,ifp,im,mis,mtd,mv,rac,res,sa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mech8_ques);

        aice = findViewById(R.id.aice);
        amt = findViewById(R.id.amt);
        ap = findViewById(R.id.ap);
        cim = findViewById(R.id.cim);
        ec3 = findViewById(R.id.ec3);
        fem = findViewById(R.id.fem);
        ifp = findViewById(R.id.ifp);
        im = findViewById(R.id.im);
        mis = findViewById(R.id.mis);
        mtd = findViewById(R.id.mtd);
        mv = findViewById(R.id.mv);
        rac = findViewById(R.id.rac);
        res = findViewById(R.id.res);
        sa = findViewById(R.id.sa);

        aice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech8QuesActivity.this, BeMech8_aice.class);
                startActivity(intent);
            }
        });
        amt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech8QuesActivity.this, BeMech8_amt.class);
                startActivity(intent);
            }
        });
        ap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech8QuesActivity.this, BeMech8_ap.class);
                startActivity(intent);
            }
        });
        cim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech8QuesActivity.this, BeMech8_cim.class);
                startActivity(intent);
            }
        });
        ec3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech8QuesActivity.this, BeMech8_ec3.class);
                startActivity(intent);
            }
        });
        fem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech8QuesActivity.this, BeMech8_fem.class);
                startActivity(intent);
            }
        });
        ifp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech8QuesActivity.this, BeMech8_ifp.class);
                startActivity(intent);
            }
        });
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech8QuesActivity.this, BeMech8_im.class);
                startActivity(intent);
            }
        });
        mis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech8QuesActivity.this, BeMech8_mis.class);
                startActivity(intent);
            }
        });
        mtd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech8QuesActivity.this, BeMech8_mtd.class);
                startActivity(intent);
            }
        });
        mv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech8QuesActivity.this, BeMech8_mv.class);
                startActivity(intent);
            }
        });
        rac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech8QuesActivity.this, BeMech8_rac.class);
                startActivity(intent);
            }
        });
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech8QuesActivity.this, BeMech8_res.class);
                startActivity(intent);
            }
        });
        sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech8QuesActivity.this, BeMech8_sa.class);
                startActivity(intent);
            }
        });


    }
}
