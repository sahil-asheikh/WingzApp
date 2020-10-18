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
import com.wingzapp.wingz.BeExtc.BeExtc6_Cse;
import com.wingzapp.wingz.BeExtc.BeExtc6_Dc;
import com.wingzapp.wingz.BeExtc.BeExtc6_Dsp;
import com.wingzapp.wingz.BeExtc.BeExtc6_Fe;
import com.wingzapp.wingz.BeExtc.BeExtc6_Tcss;

public class Extc6QuesActivity extends AppCompatActivity {
    Button cse,dc,dsp,fe,tcss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extc6_ques);

        cse=findViewById(R.id.cse);
        dc=findViewById(R.id.dc);
        dsp=findViewById(R.id.dsp);
        fe=findViewById(R.id.fe);
        tcss=findViewById(R.id.tcss);

        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc6QuesActivity.this, BeExtc6_Cse.class);
                startActivity(intent);
            }
        });
        dc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc6QuesActivity.this, BeExtc6_Dc.class);
                startActivity(intent);
            }
        });
        dsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc6QuesActivity.this, BeExtc6_Dsp.class);
                startActivity(intent);
            }
        });
        fe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc6QuesActivity.this, BeExtc6_Fe.class);
                startActivity(intent);
            }
        });
        tcss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extc6QuesActivity.this, BeExtc6_Tcss.class);
                startActivity(intent);
            }
        });
    }
}
