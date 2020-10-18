package com.wingzapp.wingz.BeMech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
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

public class BeMech7_ie extends AppCompatActivity {
    Button s19,s18,s17,s16,s15,w19,w18,w17,w16,w15;
    WebView webView;
    CardView cardView;
    private ProgressBar progressBar;
    private String WIN16,WIN18,WIN17,SUM16,SUM17,WIN15,SUM18,SUM19;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_mech7_ie);

        WIN15 =  "16jzKegD6BxlmFtGvf8xQ49YKhKf73Hlk";
        SUM16 =  "15obqXL7QHMlfvPM--ncMEKr2msb67Ybi";
        WIN16 =  "15q50TA1d87SqGN4oemEH0fbq6j6uGxGC";
        SUM17 =  "15IbtZB9Krldn8e0IcrZpPhFxieWygdgv";
        WIN17 =  "14TAQ3iETk5wlFQZewHl0oDh5WOKNV_NY";
        SUM18 =  "13qPoI3CIQYm0jjXOTGUk-RlRUX_yyLG4";
        WIN18 =  "13F1B-6m1t5N94S4syeQarvJTCeYpMdoF";
        SUM19 =  "1D3k8-L6-bTJWKLJudhOCUlumEqsi5nDp";


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
                progressBar.setVisibility(View.VISIBLE);
                webView.setVisibility(View.VISIBLE);
                cardView.setVisibility(GONE);
                webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=https://drive.google.com/u/1/uc?id="+SUM19+"&export=download");

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
                webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=https://drive.google.com/u/1/uc?id="+SUM16+"&export=download");

            }
        });
        s17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                webView.setVisibility(View.VISIBLE);
                cardView.setVisibility(GONE);
                webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=https://drive.google.com/u/1/uc?id="+SUM17+"&export=download");

            }
        });
        s18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                webView.setVisibility(View.VISIBLE);
                cardView.setVisibility(GONE);
                webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=https://drive.google.com/u/1/uc?id="+SUM18+"&export=download");

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
                webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=https://drive.google.com/u/1/uc?id="+WIN18+"&export=download");

            }
        });
        w17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                webView.setVisibility(View.VISIBLE);
                cardView.setVisibility(GONE);
                webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=https://drive.google.com/u/1/uc?id="+WIN17+"&export=download");

            }
        });
        w16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                webView.setVisibility(View.VISIBLE);
                cardView.setVisibility(GONE);
                webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=https://drive.google.com/u/1/uc?id="+WIN16+"&export=download");

            }
        });
        w15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                webView.setVisibility(View.VISIBLE);
                cardView.setVisibility(GONE);
                webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=https://drive.google.com/u/1/uc?id="+WIN15+"&export=download");

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