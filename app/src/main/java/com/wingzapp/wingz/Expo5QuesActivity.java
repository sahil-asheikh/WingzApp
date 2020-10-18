package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wingzapp.wingz.BeExpo.BeExpo5_em2;
import com.wingzapp.wingz.BeExpo.BeExpo5_emd;
import com.wingzapp.wingz.BeExpo.BeExpo5_eps1;
import com.wingzapp.wingz.BeExpo.BeExpo5_mpi;
import com.wingzapp.wingz.BeExpo.BeExpo5_uee;

public class Expo5QuesActivity extends AppCompatActivity {
Button em2,emd,eps1,mpi,uee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expo5_ques);

        em2 = findViewById(R.id.em2);
        emd = findViewById(R.id.emd);
        eps1 = findViewById(R.id.eps1);
        mpi = findViewById(R.id.mpi);
        uee = findViewById(R.id.uee);

        em2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo5QuesActivity.this, BeExpo5_em2.class);
                startActivity(intent);
            }
        });
        emd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo5QuesActivity.this, BeExpo5_emd.class);
                startActivity(intent);
            }
        });
        eps1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo5QuesActivity.this, BeExpo5_eps1.class);
                startActivity(intent);
            }
        });
        mpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo5QuesActivity.this, BeExpo5_mpi.class);
                startActivity(intent);
            }
        });
        uee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Expo5QuesActivity.this, BeExpo5_uee.class);
                startActivity(intent);
            }
        });

    }
}
