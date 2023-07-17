package com.example.enhanceforloop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtEnhanced = findViewById(R.id.txtEnhanced);



        String[] CountryName = {"india", "amarica\n", "lisuna\n", "burmese\n", "indonasia\n", "china\n" +
                "Africa\n", "Austraila\n", "France\n", "Japan\n", "SaudiAribaia\n", };

        String AllCountry = " ";

        for(String myOldSt : CountryName){
            AllCountry = AllCountry + myOldSt;
        }

        txtEnhanced.setText(AllCountry);

    }
}