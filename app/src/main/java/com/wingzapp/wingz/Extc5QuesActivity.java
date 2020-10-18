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
import com.wingzapp.wingz.BeExtc.BeExtc5_Acd;
import com.wingzapp.wingz.BeExtc.BeExtc5_Awp;
import com.wingzapp.wingz.BeExtc.BeExtc5_Ec;
import com.wingzapp.wingz.BeExtc.BeExtc5_Ieed;
import com.wingzapp.wingz.BeExtc.BeExtc5_mm;

public class Extc5QuesActivity extends AppCompatActivity {
    Button acd,awp,ec,ieed,mm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extc5_ques);

        acd=findViewById(R.id.acd);
        awp=findViewById(R.id.awp);
        ec=findViewById(R.id.ec);
        ieed=findViewById(R.id.ieed);
        mm=findViewById(R.id.mm);

        acd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc5QuesActivity.this, BeExtc5_Acd.class);
                startActivity(intent);
            }
        });
        awp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc5QuesActivity.this, BeExtc5_Awp.class);
                startActivity(intent);
            }
        });
        ec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc5QuesActivity.this, BeExtc5_Ec.class);
                startActivity(intent);
            }
        });
        ieed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc5QuesActivity.this, BeExtc5_Ieed.class);
                startActivity(intent);
            }
        });
        mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc5QuesActivity.this, BeExtc5_mm.class);
                startActivity(intent);
            }
        });
    }
}
