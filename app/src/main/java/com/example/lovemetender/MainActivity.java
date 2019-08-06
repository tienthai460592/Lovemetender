package com.example.lovemetender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    TextView tempDescription;
    TextView temperature;
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
        loadWeather();
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

    public void loadWeather() {

        temperature = findViewById(R.id.degree);
        tempDescription = findViewById(R.id.weather_desc);

        String url ="http://api.openweathermap.org/data/2.5/weather?q=islamabad,pakistan&appid=90ebdc57172a838d0fce0abbc044df8e&units=Imperial";
        JsonObjectRequest jor = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONObject main_object = response.getJSONObject("main");
                    JSONArray array = response.getJSONArray("weather");
                    JSONObject object = array.getJSONObject(0);
                    String temp = String.valueOf(main_object.getDouble("temp"));
                    String description = object.getString("description");


                    tempDescription.setText(description);

                    double temp_int = Double.parseDouble(temp);
                    double centi = (temp_int - 32) / 1.8000;
                    centi = Math.round(centi);
                    int i = (int) centi;
                    temperature.setText(String.valueOf(i));


                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                    temperature.setText(error.getMessage());
                Log.i("TienS",  error.getMessage());
            }
        }
        );
        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(jor);


    }
}
