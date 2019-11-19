package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CoustomAdapter extends ArrayAdapter<LocationInfo> {

    public CoustomAdapter(Activity context, ArrayList<LocationInfo> locationDetails) {
        super(context, 0, locationDetails);}

    @NonNull
    @Override
    //getview overiding
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }
        LocationInfo currentLoc=getItem(position);

        TextView mainTextD= (TextView) listItemView.findViewById(R.id.main_text);
        mainTextD.setText(currentLoc.getLocName());

        TextView secondaryTextD= (TextView) listItemView.findViewById(R.id.secondary_text);
        secondaryTextD.setText(currentLoc.getLocDescrition());

        ImageView songImage= (ImageView) listItemView.findViewById(R.id.displayImage);
        songImage.setImageResource(currentLoc.getImgId());

        TextView ratingTextD=(TextView) listItemView.findViewById(R.id.rating_text);
        ratingTextD.setText(currentLoc.getLocRating());

        return listItemView;
    }
}
