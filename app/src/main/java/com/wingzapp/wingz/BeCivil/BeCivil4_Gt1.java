package com.wingzapp.wingz.BeCivil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.wingzapp.wingz.R;

import static android.view.View.GONE;

public class BeCivil4_Gt1 extends AppCompatActivity {
    Button s19,s18,s17,s16,s15,w19,w18,w17,w16,w15;
    WebView webView;
    CardView cardView;
    private ProgressBar progressBar;
    private String sum16,win16,win17,win18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_civil4__gt1);

        sum16 ="19r-zHIDLUe424VBxpyV5Bgx0G7jLD2ao";
        win16="19tGDpgVni9nnOQ73Q8BXIQsXNtjkvCio";
        win17="1A0G-rqxUl7FBr72TZuPxZlMMScMhKujY";
        win18="19s2iZ7TVj8ovt5MpTxy8awfYycuEma1H";

        webView = findViewById(R.id.WV);
        progressBar = findViewById(R.id.pb);
        cardView=findViewById(R.id.card);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient() {

            @Override
            public void onPageFinished(WebView view, String url) {

                webView.loadUrl("javascript:(function() { " +
                        "document.querySelector('[role=\"toolbar\"]').remove();})()");
                progressBar.setVisibility(GONE);
            }
        });
        s15 = findViewById(R.id.s15);s16 = findViewById(R.id.s16);s17 = findViewById(R.id.s17);s18 = findViewById(R.id.s18);s19 = findViewById(R.id.s19);
        w15 = findViewById(R.id.w15); w16 = findViewById(R.id.w16); w17 = findViewById(R.id.w17);w18 = findViewById(R.id.w18); w19 = findViewById(R.id.w19);

        s19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast= Toast.makeText(getApplicationContext(),"Not Available Yet!!",Toast.LENGTH_SHORT);
                toast.show();

            }
        });
        s15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast= Toast.makeText(getApplicationContext(),"Not Available Yet!!",Toast.LENGTH_SHORT);
                toast.show();

            }
        });
        s16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                webView.setVisibility(View.VISIBLE);
                cardView.setVisibility(GONE);
                webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=https://drive.google.com/u/1/uc?id="+sum16+"&export=download");

            }
        });
        s17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast= Toast.makeText(getApplicationContext(),"Not Available Yet!!",Toast.LENGTH_SHORT);
                toast.show();

            }
        });


        s18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast= Toast.makeText(getApplicationContext(),"Not Available Yet!!",Toast.LENGTH_SHORT);
                toast.show();

            }
        });
        w19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast= Toast.makeText(getApplicationContext(),"Not Available Yet!!",Toast.LENGTH_SHORT);
                toast.show();

            }
        });
        w18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                webView.setVisibility(View.VISIBLE);
                cardView.setVisibility(GONE);
                webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=https://drive.google.com/u/1/uc?id="+win18+"&export=download");

            }
        });
        w17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                webView.setVisibility(View.VISIBLE);
                cardView.setVisibility(GONE);
                webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=https://drive.google.com/u/1/uc?id="+win17+"&export=download");

            }
        });
        w16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                webView.setVisibility(View.VISIBLE);
                cardView.setVisibility(GONE);
                webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=https://drive.google.com/u/1/uc?id="+win16+"&export=download");

            }
        });
        w15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast= Toast.makeText(getApplicationContext(),"Not Available Yet!!",Toast.LENGTH_SHORT);
                toast.show();

            }
        });

    }

    public void onBackPressed() {

        if (cardView.getVisibility()== View.VISIBLE){
            super.onBackPressed();
        } else {
            cardView.setVisibility(View.VISIBLE);
            webView.setVisibility(GONE);
        }
    }
}