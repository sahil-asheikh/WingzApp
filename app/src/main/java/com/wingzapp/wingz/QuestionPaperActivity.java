package com.wingzapp.wingz;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class QuestionPaperActivity extends AppCompatActivity {
    Button fi,c1,me1,el,ec,civil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_paper);
        fi = (Button)findViewById(R.id.btn_1year_ques);
        fi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuestionPaperActivity.this, Ques_1stBeActivity.class);
                startActivity(intent);
            }
        });
        c1= (Button)findViewById(R.id.btn_cse_ques);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuestionPaperActivity.this, CseQuesPprActivity.class);
                startActivity(intent);
            }
        });
        me1= (Button)findViewById(R.id.btn_mech_ques);
        me1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuestionPaperActivity.this, MechQuesPprActivity.class);
                startActivity(intent);
            }
        });
        civil= (Button)findViewById(R.id.btn_civil_ques);
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuestionPaperActivity.this, CivilQuesPprActivity.class);
                startActivity(intent);
            }
        });
        el= (Button)findViewById(R.id.btn_expo_ques);
        el.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuestionPaperActivity.this, ExpoQuesPprActivity.class);
                startActivity(intent);
            }
        });
        ec= (Button)findViewById(R.id.btn_extc_ques);
        ec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuestionPaperActivity.this, ExtcQuesPprActivity.class);
                startActivity(intent);
            }
        });

    }



}
