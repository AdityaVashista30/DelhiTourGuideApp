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
public class ResterauntFragment extends Fragment {


    public ResterauntFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.loc_list, container, false);
        ArrayList<LocationInfo> loc=new ArrayList<LocationInfo>();
        loc.add(new LocationInfo(R.string.rest_1_name,R.string.rest_1_des,R.string.rest_1_rating,R.drawable.r1));
        loc.add(new LocationInfo(R.string.rest_2_name,R.string.rest_2_des,R.string.rest_2_rating,R.drawable.r2));
        loc.add(new LocationInfo(R.string.rest_3_name,R.string.rest_3_des,R.string.rest_3_rating,R.drawable.r3));
        loc.add(new LocationInfo(R.string.rest_4_name,R.string.rest_4_des,R.string.rest_4_rating,R.drawable.r4));
        loc.add(new LocationInfo(R.string.rest_5_name,R.string.rest_5_des,R.string.rest_5_rating,R.drawable.r5));
        loc.add(new LocationInfo(R.string.rest_6_name,R.string.rest_6_des,R.string.rest_6_rating,R.drawable.r6));
        loc.add(new LocationInfo(R.string.rest_7_name,R.string.rest_7_des,R.string.rest_7_rating,R.drawable.r7));
        loc.add(new LocationInfo(R.string.rest_8_name,R.string.rest_8_des,R.string.rest_8_rating,R.drawable.r8));
        loc.add(new LocationInfo(R.string.rest_9_name,R.string.rest_9_des,R.string.rest_9_rating,R.drawable.r9));
        loc.add(new LocationInfo(R.string.rest_10_name,R.string.rest_10_des,R.string.rest_10_rating,R.drawable.r10));
        CoustomAdapter itemsAdapter= new CoustomAdapter(getActivity(),loc);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
