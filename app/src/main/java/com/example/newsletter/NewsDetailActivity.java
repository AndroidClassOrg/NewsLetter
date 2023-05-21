package com.example.newsletter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class NewsDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        String cityName = getIntent().getStringExtra("cityName");
        String url = "";

        switch (cityName.toUpperCase())
        {
            case "REDMOND":
                url = "https://www.redmond.gov/";
                break;

            case "BELLEVUE":
                url = "https://bellevuewa.gov/";
                break;

            case "SAMMAMISH":
                url = "https://www.sammamish.us/";
                break;

            case "BOTHELL":
                url = "https://www.bothellwa.gov/";
                break;

            case "SEATTLE":
                url = "https://www.seattle.gov/";
                break;

            case "ISSAQUAH":
                url = "https://www.issaquahwa.gov/";
                break;
        }

        WebView webView = findViewById(R.id.webView);
        webView.loadUrl(url);
    }
}