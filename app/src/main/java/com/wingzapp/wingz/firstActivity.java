package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class firstActivity extends AppCompatActivity {

    Button login, signup;
    private FirebaseAuth mAuth;
    FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        getSupportActionBar().hide();


        mAuth = FirebaseAuth.getInstance();
        user = mAuth.getCurrentUser();

        if(user!=null){
            startActivity(new Intent(getApplicationContext(),Login.class));
            firstActivity.this.finish();
        }

//        if (mAuth.getCurrentUser() != null) {
//            startActivity(new Intent(firstActivity.this, MainActivity.class));
//            finish();
//        }

        login = findViewById(R.id.login);
        signup = findViewById(R.id.signup);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(firstActivity.this, Login.class);
                startActivity(intent);
                firstActivity.this.finish();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(firstActivity.this, Registor.class);
                startActivity(intent);
                firstActivity.this.finish();
            }
        });

    }
}