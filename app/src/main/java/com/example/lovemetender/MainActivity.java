package com.example.lovemetender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView contentView;
    RecyclerAdapter contentViewAdapter;
    CustomSpinnerAdapter customSpinnerAdapter;
    ArrayList<Destination> destinations = DataProvider.destinations;
    ArrayList<Location> locations = DataProvider.locations;
    Spinner location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inflateRecyclerView();
        locationSpinnerSetup();
    }

    private void inflateRecyclerView() {
        contentView = findViewById(R.id.contentView);
        contentViewAdapter = new RecyclerAdapter(this, destinations);
        contentView.setAdapter(contentViewAdapter);
        contentView.setOverScrollMode(View.OVER_SCROLL_NEVER);
    }

    private void locationSpinnerSetup() {
        location = findViewById(R.id.locationToShow);
        customSpinnerAdapter = new CustomSpinnerAdapter(this, locations);
        location.setAdapter(customSpinnerAdapter);
    }
}
