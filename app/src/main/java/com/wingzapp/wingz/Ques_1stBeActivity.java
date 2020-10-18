package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ques_1stBeActivity extends AppCompatActivity {
    Button m1,phy1,phy2,m2,chem1,chem2,bee,aee,bce,eg,em;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_1st_be);
        m1 = (Button)findViewById(R.id.btn_m1);
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ques_1stBeActivity.this, M1QuesBeActivity.class);
                startActivity(intent);
            }
        });
        m2 = (Button)findViewById(R.id.btn_m2);
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ques_1stBeActivity.this, M2QuesBeActivity.class);
                startActivity(intent);
            }
        });
        phy1 = (Button)findViewById(R.id.btn_phy1);
        phy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ques_1stBeActivity.this, Phy1QuesBeActivity.class);
                startActivity(intent);
            }
        });
        phy2 = (Button)findViewById(R.id.btn_phy2);
        phy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ques_1stBeActivity.this, Phy2QuesBeActivity.class);
                startActivity(intent);
            }
        });
        chem1 = (Button)findViewById(R.id.btn_chem1);
        chem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ques_1stBeActivity.this, Chem1QuesBeActivity.class);
                startActivity(intent);
            }
        });
        chem2 = (Button)findViewById(R.id.btn_chem2);
        chem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ques_1stBeActivity.this, Chem2QuesBeActivity.class);
                startActivity(intent);
            }
        });
        bee = (Button)findViewById(R.id.btn_bee);
        bee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ques_1stBeActivity.this, BeeQuesBeActivity.class);
                startActivity(intent);
            }
        });
        aee = (Button)findViewById(R.id.btn_aee);
        aee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ques_1stBeActivity.this, AeeQuesBeActivity.class);
                startActivity(intent);
            }
        });
        bce = (Button)findViewById(R.id.btn_bce);
        bce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ques_1stBeActivity.this, BceQuesBeActivity.class);
                startActivity(intent);
            }
        });
        em = (Button)findViewById(R.id.btn_em);
        em.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ques_1stBeActivity.this, EmQuesBeActivity.class);
                startActivity(intent);
            }
        });
        eg = (Button)findViewById(R.id.btn_EG1);
        eg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ques_1stBeActivity.this, EgQuesBeActivity.class);
                startActivity(intent);
            }
        });

    }
}
