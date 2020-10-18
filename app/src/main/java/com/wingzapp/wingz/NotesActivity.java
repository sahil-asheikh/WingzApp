package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotesActivity extends AppCompatActivity {
    Button fi,c1,me1,el,ec,ci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        fi = (Button)findViewById(R.id.btn_1st_notes);
        fi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NotesActivity.this, FirstyearNotesBeActivity.class);
                startActivity(intent);
            }
        });
        c1 = (Button)findViewById(R.id.btn_cse_notes);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NotesActivity.this, CseNotesBeActivity.class);
                startActivity(intent);
            }
        });
        me1 = (Button)findViewById(R.id.btn_mech_notes);
        me1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NotesActivity.this, MechNotesBeActivity.class);
                startActivity(intent);
            }
        });
        ci = (Button)findViewById(R.id.btn_civil_notes);
        ci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NotesActivity.this, CivilNotesBeActivity.class);
                startActivity(intent);
            }
        });
        el = (Button)findViewById(R.id.btn_expo_notes);
        el.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NotesActivity.this, ExpoNotesBeActivity.class);
                startActivity(intent);
            }
        });
        ec = (Button)findViewById(R.id.btn_extc_notes);
        ec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NotesActivity.this, ExtcNotesBeActivity.class);
                startActivity(intent);
            }
        });
    }
}
