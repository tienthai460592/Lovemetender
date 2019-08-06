package com.example.lovemetender;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<Destination> destinations;
    private Context mContext;
    private Color colorCode;

    public RecyclerAdapter(Context context, List<Destination> destinations) {
        this.mContext = context;
        this.destinations = destinations;
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View itemView = inflater.inflate(R.layout.itemview, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {
        Destination currentDes = destinations.get(position);

        /** usually bad practice to leave commented code in the project */

        holder.locationName.setText(currentDes.getName());
        holder.locationName.setTextSize(20);
        /** Try and make a dynamic list of actual items. */
        holder.locationIntro.setText(currentDes.getIntroduction());
        holder.locationType.setText(currentDes.getType());
        holder.locationOpenHour.setText(currentDes.getOpeningHours());
        if (currentDes.getType().equalsIgnoreCase("Hotel")){
           holder.locationType.setTextColor(ContextCompat.getColor(mContext,R.color.red));
           holder.locationOpenHour.setTextColor(ContextCompat.getColor(mContext,R.color.red));
           holder.divider.setTextColor(ContextCompat.getColor(mContext,R.color.red));

        }else {
            holder.locationType.setTextColor(ContextCompat.getColor(mContext,R.color.green));
            holder.locationOpenHour.setTextColor(ContextCompat.getColor(mContext,R.color.green));
            holder.divider.setTextColor(ContextCompat.getColor(mContext,R.color.green));
        }

    }

    @Override
    public int getItemCount() {
        return destinations.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView locationName, locationIntro, locationType, locationOpenHour,divider;

        /**
         * inconsistent naming of fields. I personally prefer degreec, description over textViewName,
         * textViewDescription. As the type is already TextView and otherwise it's very redundant to
         * read TextView textViewName
         */

        public ImageView locationView;

        /**
         * This is bad naming. And missing an enter after the semicolum
         */
        public ViewHolder(View itemView) {
            super(itemView);

            locationName = itemView.findViewById(R.id.locationName);
            locationView = itemView.findViewById(R.id.locationPicPreview);
            locationIntro = itemView.findViewById(R.id.locationIntro);
            locationType = itemView.findViewById(R.id.locationType);
            locationOpenHour = itemView.findViewById(R.id.locationOpenHours);
            divider  = itemView.findViewById(R.id.divider);


        }
        /**I'd recommend you to use view injection or a library like dagger or retrofit instead
         * of setting views like this.
         * bad id degreec*/
    }

}
