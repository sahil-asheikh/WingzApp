package com.wingzapp.wingz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Objects;

public class Login extends AppCompatActivity {
    EditText txt_email,txt_password;
    Button login,registor;
    ProgressBar progressBar;
    private FirebaseAuth mAuth;
    FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Login Form");

        getSupportActionBar().hide();

        //Casting Views
        txt_email =(EditText) findViewById(R.id.username);
        txt_password =(EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        registor = findViewById(R.id.registor);
        progressBar = findViewById(R.id.loading);
        mAuth = FirebaseAuth.getInstance();
        user = mAuth.getCurrentUser();


        if(user!=null){
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            Login.this.finish();
        }
//        else {
//            Toast.makeText(getApplicationContext(),"Login To Continue",Toast.LENGTH_SHORT).show();
//        }



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = txt_email.getText().toString();
                String password = txt_password.getText().toString();

                if (email.isEmpty() && password.isEmpty()) {
                    txt_email.setError("Please enter Email");
                    txt_password.setError("Please enter Password");
                    txt_email.requestFocus();
                }
                else if (email.isEmpty()) {
                    txt_email.setError("Please enter Email");
                }
                else if (password.isEmpty()) {
                    txt_password.setError("Please enter Password");
                }
                else if (password.length() < 6) {
                    txt_password.setError("Length Too Short");
                }
                else   {
                    progressBar.setVisibility(View.VISIBLE);
                    mAuth.signInWithEmailAndPassword(email, password)
                            .addOnCompleteListener(Login.this, new OnCompleteListener<AuthResult>() {

                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    progressBar.setVisibility(View.GONE);
                                    if (task.isSuccessful()) {

                                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                        Login.this.finish();

                                    } else {
//                                       make popup window to show

                                        Toast.makeText(getApplicationContext(), "Login Failed or User Not Exist", Toast.LENGTH_SHORT).show();

                                    }

                                }
                            });
                }
            }

        });
        registor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Registor.class));
                Login.this.finish();
            }
        });
    }
}