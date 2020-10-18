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

public class BeCivil8_Gis extends AppCompatActivity {
    Button s19,s18,s17,s16,s15,w19,w18,w17,w16,w15;
    WebView webView;
    CardView cardView;
    private ProgressBar progressBar;
    private String sum16,sum17,sum18,sum19,win16,win17,win18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_civil8__gis);

        sum16 ="17BpiVe0bRZbmatK3XYyJQCFuqun-QlPN";
        sum17="17Sb4nEoijj68sgji-bafTvQPi3yCzZ28";
        sum18="17NEdMDM_dAbXPwfaZ9eSyFpxudl4t9Ct";
        sum19="1790KPc2qS6x7TgPCmmyjv5C9fm-r0pwC";
        win16="17AqSj2u054Xd7mDdjh0wakqUd4zARBBe";
        win17="17BpiVe0bRZbmatK3XYyJQCFuqun-QlPN";
        win18="1756mu03LLA12VWwQdcuvenPoSm37eOue";

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
                webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=https://drive.google.com/u/1/uc?id="+sum19+"&export=download");

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
                progressBar.setVisibility(View.VISIBLE);
                webView.setVisibility(View.VISIBLE);
                cardView.setVisibility(GONE);
                webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=https://drive.google.com/u/1/uc?id="+sum17+"&export=download");

            }
        });
        s18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                webView.setVisibility(View.VISIBLE);
                cardView.setVisibility(GONE);
                webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=https://drive.google.com/u/1/uc?id="+sum18+"&export=download");

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