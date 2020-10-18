package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeCse.BeCse6_ai;
import com.wingzapp.wingz.BeCse.BeCse6_cn;
import com.wingzapp.wingz.BeCse.BeCse6_dp;
import com.wingzapp.wingz.BeCse.BeCse6_fe;
import com.wingzapp.wingz.BeCse.BeCse6_sepm;

public class Cse6QuesActivity extends AppCompatActivity {
    Button ai,cn,dp,fe,sepm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse6_ques);

        ai=findViewById(R.id.ai);
        cn = findViewById(R.id.cn);
        dp = findViewById(R.id.dp);
        fe = findViewById(R.id.fe);
        sepm = findViewById(R.id.sepm);

        ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse6QuesActivity.this, BeCse6_ai.class);
                startActivity(intent);
            }
        });
        cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse6QuesActivity.this, BeCse6_cn.class);
                startActivity(intent);
            }
        });
        dp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse6QuesActivity.this, BeCse6_dp.class);
                startActivity(intent);
            }
        });
        fe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse6QuesActivity.this, BeCse6_fe.class);
                startActivity(intent);
            }
        });
        sepm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cse6QuesActivity.this, BeCse6_sepm.class);
                startActivity(intent);
            }
        });

    }
}
