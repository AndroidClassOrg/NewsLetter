package com.example.newsletter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCityButtonClick(View view) {
        String cityName = (String) view.getTag();
        // Create an Intent to launch the CityActivity
        Intent intent = new Intent(this, NewsDetailActivity.class);

        // Pass the selected city as an extra parameter to the CityActivity
        intent.putExtra("cityName", cityName);

        // Start the CityActivity
        startActivity(intent);
    }
}