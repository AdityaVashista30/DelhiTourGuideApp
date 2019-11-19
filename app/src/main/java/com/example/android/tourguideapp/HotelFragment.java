package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.loc_list, container, false);
        ArrayList<LocationInfo> loc=new ArrayList<LocationInfo>();
        loc.add(new LocationInfo(R.string.hotel_1_name,R.string.hotel_1_des,R.string.hotel_1_rating,R.drawable.h1));
        loc.add(new LocationInfo(R.string.hotel_2_name,R.string.hotel_2_des,R.string.hotel_2_rating,R.drawable.h2));
        loc.add(new LocationInfo(R.string.hotel_3_name,R.string.hotel_3_des,R.string.hotel_3_rating,R.drawable.h3));
        loc.add(new LocationInfo(R.string.hotel_4_name,R.string.hotel_4_des,R.string.hotel_4_rating,R.drawable.h4));
        loc.add(new LocationInfo(R.string.hotel_5_name,R.string.hotel_5_des,R.string.hotel_5_rating,R.drawable.h5));
        loc.add(new LocationInfo(R.string.hotel_6_name,R.string.hotel_6_des,R.string.hotel_6_rating,R.drawable.h6));
        loc.add(new LocationInfo(R.string.hotel_7_name,R.string.hotel_7_des,R.string.hotel_7_rating,R.drawable.h7));
        loc.add(new LocationInfo(R.string.hotel_8_name,R.string.hotel_8_des,R.string.hotel_8_rating,R.drawable.h8));
        loc.add(new LocationInfo(R.string.hotel_9_name,R.string.hotel_9_des,R.string.hotel_9_rating,R.drawable.h9));
        loc.add(new LocationInfo(R.string.hotel_10_name,R.string.hotel_10_des,R.string.hotel_10_rating,R.drawable.h10));

        CoustomAdapter itemsAdapter= new CoustomAdapter(getActivity(),loc);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }
}
