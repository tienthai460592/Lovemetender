package com.example.lovemetender;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomSpinnerAdapter extends BaseAdapter implements SpinnerAdapter {

    ArrayList<Location> locations;

    Context context;

    public CustomSpinnerAdapter(Context context, ArrayList<Location> locations) {

        this.locations = locations;
        this.context = context;

    }

    @Override
    public int getCount() {

        return locations.size();

    }

    @Override
    public Object getItem(int position) {

        return locations.get(position);

    }

    @Override
    public long getItemId(int position) {

        return position;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = View.inflate(context, R.layout.location_spinner_main, null);
        TextView textView = view.findViewById(R.id.main);
        textView.setText(locations.get(position).getName());
        return textView;

    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {

        View view;
        view = View.inflate(context, R.layout.location_dropdown, null);
        final TextView textView = view.findViewById(R.id.location_dropdown);
        textView.setText(locations.get(position).getName());
        return view;

    }

}
