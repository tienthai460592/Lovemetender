package com.example.lovemetender;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private List<Location> mItems;
    private Context mContext;

    public RecyclerAdapter(Context context, List<Location> items) {
        this.mContext = context;
        this.mItems = items;
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
//        Item item = mItems.get(position);

        /** usually bad practice to leave commented code in the project */

        holder.locationName.setText("El Chiringuito");
        /** Try and make a dynamic list of actual items. */
        holder.locationIntro.setText("Ten seasons of culinary " +
                "satisfaction on Ibiza. Serving honest, great tasting food in a warm, soft and loving environment.");

    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView locationName,locationIntro ;

        /**inconsistent naming of fields. I personally prefer name, description over textViewName,
         * textViewDescription. As the type is already TextView and otherwise it's very redundant to
         * read TextView textViewName*/

        public ImageView locationView;

        /**This is bad naming. And missing an enter after the semicolum*/
        public ViewHolder(View itemView) {
            super(itemView);

            locationName = itemView.findViewById(R.id.locationName);
            locationView =  itemView.findViewById(R.id.locationPicPreview);
            locationIntro = itemView.findViewById(R.id.locationIntro);


        }
        /**I'd recommend you to use view injection or a library like dagger or retrofit instead
         * of setting views like this.
         * bad id name*/
    }

}
