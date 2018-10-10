package com.androidapps.robertsteele.beeradvisor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindBeerActivity extends AppCompatActivity {

    private static Button mFindBeerButton;
    private static Spinner mBeerSpinner;
    private static TextView mBeerTypesView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
        mBeerSpinner = findViewById(R.id.spinner);
        mFindBeerButton = findViewById(R.id.find_beer);
        mBeerTypesView = findViewById(R.id.brands);
        mFindBeerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String beerType = mBeerSpinner.getSelectedItem().toString();
                String beerBrands = Arrays.toString(BeerExpert.getBeers(beerType))
                        .replace("]", "")
                        .replace("[", "");
                mBeerTypesView.setText(beerBrands);
            }
        });

    }
}
