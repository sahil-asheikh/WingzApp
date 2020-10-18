package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeMech.BeMech6_cse;
import com.wingzapp.wingz.BeMech.BeMech6_dm;
import com.wingzapp.wingz.BeMech.BeMech6_ec1;
import com.wingzapp.wingz.BeMech.BeMech6_fe;
import com.wingzapp.wingz.BeMech.BeMech6_mt;
import com.wingzapp.wingz.BeMech.BeMech6_or;

public class Mech6QuesActivity extends AppCompatActivity {
    Button cse,dm,ec1,fe,mt,or;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mech6_ques);

        cse = findViewById(R.id.cse);
        dm = findViewById(R.id.dm);
        ec1 = findViewById(R.id.ec1);
        fe = findViewById(R.id.fe);
        mt = findViewById(R.id.mt);
        or = findViewById(R.id.or);

        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech6QuesActivity.this, BeMech6_cse.class);
                startActivity(intent);
            }
        });
        dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech6QuesActivity.this, BeMech6_dm.class);
                startActivity(intent);
            }
        });
        ec1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech6QuesActivity.this, BeMech6_ec1.class);
                startActivity(intent);
            }
        });
        fe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech6QuesActivity.this, BeMech6_fe.class);
                startActivity(intent);
            }
        });
        mt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech6QuesActivity.this, BeMech6_mt.class);
                startActivity(intent);
            }
        });
        or.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mech6QuesActivity.this, BeMech6_or.class);
                startActivity(intent);
            }
        });

    }
}
