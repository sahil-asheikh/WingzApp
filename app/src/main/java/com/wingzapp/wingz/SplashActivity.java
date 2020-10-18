package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.time.Instant;

public class SplashActivity extends AppCompatActivity {
    private int Sleep_timer=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        Logo logo=new Logo();
        logo.start();


    }
    private class Logo extends Thread{
        public void run(){
            try{
                sleep(1000*Sleep_timer);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
            Intent intent= new Intent(SplashActivity.this, firstActivity.class);
            startActivity(intent);
            SplashActivity.this.finish();
        }
    }

}
