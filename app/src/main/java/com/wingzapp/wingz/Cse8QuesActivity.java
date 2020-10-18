package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeCse.BeCse8_awsn;
import com.wingzapp.wingz.BeCse.BeCse8_ccc;
import com.wingzapp.wingz.BeCse.BeCse8_df;
import com.wingzapp.wingz.BeCse.BeCse8_dip;
import com.wingzapp.wingz.BeCse.BeCse8_dos;
import com.wingzapp.wingz.BeCse.BeCse8_ics;
import com.wingzapp.wingz.BeCse.BeCse8_nlp;
import com.wingzapp.wingz.BeCse.BeCse8_ot;
import com.wingzapp.wingz.BeCse.BeCse8_pr;
import com.wingzapp.wingz.BeCse.BeCse8_sct;

public class Cse8QuesActivity extends AppCompatActivity {

    Button aws,ccc,df,dip,dos,ics,nlp,ot,pr,sct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse8_ques);

        aws = findViewById(R.id.aws);
        ccc = findViewById(R.id.ccc);
        df = findViewById(R.id.df);
        dip = findViewById(R.id.dip);
        dos = findViewById(R.id.dos);
        ics = findViewById(R.id.ics);
        nlp = findViewById(R.id.nlp);
        ot = findViewById(R.id.ot);
        pr = findViewById(R.id.pr);
        sct = findViewById(R.id.sct);

        aws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse8QuesActivity.this, BeCse8_awsn.class);
                startActivity(intent);
            }
        });
        ccc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse8QuesActivity.this, BeCse8_ccc.class);
                startActivity(intent);
            }
        });
        df.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse8QuesActivity.this, BeCse8_df.class);
                startActivity(intent);
            }
        });
        dip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse8QuesActivity.this, BeCse8_dip.class);
                startActivity(intent);
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse8QuesActivity.this, BeCse8_dos.class);
                startActivity(intent);
            }
        });
        ics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse8QuesActivity.this, BeCse8_ics.class);
                startActivity(intent);
            }
        });
        nlp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse8QuesActivity.this, BeCse8_nlp.class);
                startActivity(intent);
            }
        });
        ot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse8QuesActivity.this, BeCse8_ot.class);
                startActivity(intent);
            }
        });
        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse8QuesActivity.this, BeCse8_pr.class);
                startActivity(intent);
            }
        });
        sct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse8QuesActivity.this, BeCse8_sct.class);
                startActivity(intent);
            }
        });
    }
}
