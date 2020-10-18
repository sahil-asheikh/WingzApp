package com.wingzapp.wingz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Objects;

public class Registor extends AppCompatActivity {
    EditText name,txt_email,txt_password,txt_dob,phone;
    Button login,registor;
    RadioButton radioButtonMale,radioButtonFemale;
    DatabaseReference databaseReference;
    String gender="";
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registor);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Sign Up Form");

        getSupportActionBar().hide();

        //Casting Views Start
        name = findViewById(R.id.signup_input_name);
        txt_email = findViewById(R.id.signup_input_email);
        txt_password = findViewById(R.id.signup_input_password);
        txt_dob = findViewById(R.id.signup_input_age);
        phone = findViewById(R.id.number);
        login = findViewById(R.id.btn_link_login);
        registor = findViewById(R.id.btn_signup);
        radioButtonMale = findViewById(R.id.male_radio_btn);
        radioButtonFemale = findViewById(R.id.female_radio_btn);
        databaseReference = FirebaseDatabase.getInstance().getReference("Student");
        firebaseAuth = FirebaseAuth.getInstance();
        //Casting Views End

        registor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String fullname=name.getText().toString();
                final String email=txt_email.getText().toString();
                String password=txt_password.getText().toString();
                final String dob=txt_dob.getText().toString();
                final String mobile=phone.getText().toString();

                if(radioButtonMale.isChecked()){
                    gender="Male";
                }
                if(radioButtonFemale.isChecked()){
                    gender="Female";
                }

                if (fullname.isEmpty() && email.isEmpty() &&  password.isEmpty()&& dob.isEmpty()&& mobile.isEmpty()){
                    name.setError("Enter your Name");
                    txt_email.setError("Enter your Email");
                    txt_dob.setError("Enter your DOB");
                    phone.setError("Enter your Number");
                    txt_password.setError("Enter your Password");
                }

                else if(TextUtils.isEmpty(fullname)){
                    name.setError("Enter your Name");
                }
                else if(TextUtils.isEmpty(email)){
                    txt_email.setError("Enter your Email");
                }
                else if(TextUtils.isEmpty(dob)){
                    txt_dob.setError("Enter your DOB");
                }
                else if(TextUtils.isEmpty(mobile)){
                    phone.setError("Enter your Number");
                }
                else if(mobile.length() != 10){
                    phone.setError("Mobile Number Should be of 10 Digits");
                }
                else if(TextUtils.isEmpty(password)){
                    txt_password.setError("Enter your Password");
                }
                else if(password.length()<6){
                    txt_password.setError("Length Too Short");
                }
                else {
                    firebaseAuth.createUserWithEmailAndPassword(email, password)
                            .addOnCompleteListener(Registor.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {

                                        Student information = new Student(
                                                fullname,
                                                email,
                                                dob,
                                                mobile,
                                                gender

                                        );
                                        FirebaseDatabase.getInstance().getReference("Student")
                                                .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                                .setValue(information).addOnCompleteListener(new OnCompleteListener<Void>() {
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task) {
                                                Toast.makeText(Registor.this, "Registration Complete", Toast.LENGTH_SHORT).show();
                                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                                Registor.this.finish();

                                            }
                                        });

                                    } else {

                                        Toast.makeText(Registor.this, "Sorry Something Went Wrong. Please Try Again Later.", Toast.LENGTH_SHORT).show();
                                    }

                                }
                            });

                }
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Login.class));
                Registor.super.finish();
            }
        });
    }
}