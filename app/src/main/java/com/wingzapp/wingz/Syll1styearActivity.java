package com.wingzapp.wingz;

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

import static android.view.View.GONE;

public class Syll1styearActivity extends AppCompatActivity {
    Button sem1,sem2;
    WebView webView;
    CardView cardView;
    private ProgressBar progressBar;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syll1styear);

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
        sem1 = findViewById(R.id.sem1);
        sem2 = findViewById(R.id.sem2);

        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                webView.setVisibility(View.VISIBLE);
                cardView.setVisibility(GONE);
                webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=https://drive.google.com/u/1/uc?id=10lMdTYLTQ9vA58LyemX4HtAZs6UKHC9Q&export=download");

            }
        });
        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                webView.setVisibility(View.VISIBLE);
                cardView.setVisibility(GONE);
                webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=https://drive.google.com/u/1/uc?id=110MVButIVesiIacIfsroopQILZ2EwNgM&export=download");

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
