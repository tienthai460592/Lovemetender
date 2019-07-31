package com.example.lovemetender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView contentView;
    RecyclerAdapter contentViewAdapter;
    ArrayList<Location> locations = DataProvider.locations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inflateRecyclerView();
    }

    private void inflateRecyclerView(){
        contentView = findViewById(R.id.contentView);
        contentViewAdapter = new RecyclerAdapter(this, locations);
        contentView.setAdapter(contentViewAdapter);

    }
}
