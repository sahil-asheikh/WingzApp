package com.wingzapp.wingz.BeExpo;

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

public class BeExpo8_dsp extends AppCompatActivity {
    Button s19, s18, s17, s16, s15, w19, w18, w17, w16, w15;
    WebView webView;
    CardView cardView;
    private ProgressBar progressBar;
    private String WIN16, WIN17, SUM19, SUM18, SUM17;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_expo8_dsp);

        SUM19 = "1FdoQEtIklb2bdP_Rsyllv-MV9CqAjLYx";
        SUM18 = "1FqOdL-959pKJJVkqZFYOZPlVZQI0RbhA";
        WIN17 = "1FrTU7XxeVmxggXwuJJnt-sdx3LNfp73r";
        SUM17 = "1FqHkhQ55XPsRR5NQ_GTHcEBwqy6c4bLK";
        WIN16 = "1FhqvA0f_RjLUJwApSYfZfzgeIZ6dmDpA";


        webView = findViewById(R.id.WV);
        progressBar = findViewById(R.id.pb);
        cardView = findViewById(R.id.card);
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
        s15 = findViewById(R.id.s15);
        s16 = findViewById(R.id.s16);
        s17 = findViewById(R.id.s17);
        s18 = findViewById(R.id.s18);
        s19 = findViewById(R.id.s19);
        w15 = findViewById(R.id.w15);
        w16 = findViewById(R.id.w16);
        w17 = findViewById(R.id.w17);
        w18 = findViewById(R.id.w18);
        w19 = findViewById(R.id.w19);

        s19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                webView.setVisibility(View.VISIBLE);
                cardView.setVisibility(GONE);
                webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=https://drive.google.com/u/1/uc?id=" + SUM19 + "&export=download");

            }
        });
        s15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Not Available Yet!!", Toast.LENGTH_SHORT);
                toast.show();

            }
        });
        s16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Not Available Yet!!", Toast.LENGTH_SHORT);
                toast.show();

            }
        });
        s17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                webView.setVisibility(View.VISIBLE);
                cardView.setVisibility(GONE);
                webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=https://drive.google.com/u/1/uc?id=" + SUM17 + "&export=download");

            }
        });
        s18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                webView.setVisibility(View.VISIBLE);
                cardView.setVisibility(GONE);
                webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=https://drive.google.com/u/1/uc?id=" + SUM18 + "&export=download");

            }
        });
        w19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Not Available Yet!!", Toast.LENGTH_SHORT);
                toast.show();

            }
        });
        w18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Not Available Yet!!", Toast.LENGTH_SHORT);
                toast.show();

            }
        });
        w17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                webView.setVisibility(View.VISIBLE);
                cardView.setVisibility(GONE);
                webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=https://drive.google.com/u/1/uc?id=" + WIN17 + "&export=download");

            }
        });
        w16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                webView.setVisibility(View.VISIBLE);
                cardView.setVisibility(GONE);
                webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=https://drive.google.com/u/1/uc?id=" + WIN16 + "&export=download");

            }
        });
        w15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Not Available Yet!!", Toast.LENGTH_SHORT);
                toast.show();

            }
        });

    }

    public void onBackPressed() {

        if (cardView.getVisibility() == View.VISIBLE) {
            super.onBackPressed();
        } else {
            cardView.setVisibility(View.VISIBLE);
            webView.setVisibility(GONE);
        }
    }
}