package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeCivil.BeCivil4_Bcm;
import com.wingzapp.wingz.BeCivil.BeCivil4_Gt1;
import com.wingzapp.wingz.BeCivil.BeCivil4_Sa1;
import com.wingzapp.wingz.BeCivil.BeCivil4_Surveying1;
import com.wingzapp.wingz.BeCivil.BeCivil4_Tre1;

public class Civil4QuesActivity extends AppCompatActivity {
    Button bcm,geo1,sa1,survey1,te;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil4_ques);

        bcm = findViewById(R.id.bcm);
        bcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil4QuesActivity.this, BeCivil4_Bcm.class);
                startActivity(intent);

            }
        });

        geo1= findViewById(R.id.geo1);
        geo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil4QuesActivity.this, BeCivil4_Gt1.class);
                startActivity(intent);

            }
        });

        sa1=findViewById(R.id.sa1);
        sa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil4QuesActivity.this, BeCivil4_Sa1.class);
                startActivity(intent);

            }
        });

        survey1=findViewById(R.id.survey1);
        survey1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil4QuesActivity.this, BeCivil4_Surveying1.class);
                startActivity(intent);

            }
        });

        te=findViewById(R.id.te);
        te.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Civil4QuesActivity.this, BeCivil4_Tre1.class);
                startActivity(intent);

            }
        });
    }
}
