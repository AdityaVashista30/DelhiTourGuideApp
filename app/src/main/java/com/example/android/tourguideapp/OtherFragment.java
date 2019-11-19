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
public class OtherFragment extends Fragment {


    public OtherFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.loc_list, container, false);
        ArrayList<LocationInfo> loc=new ArrayList<LocationInfo>();
        loc.add(new LocationInfo(R.string.ot_1_name,R.string.ot_1_des,R.string.ot_1_rating,R.drawable.o1));
        loc.add(new LocationInfo(R.string.ot_2_name,R.string.ot_2_des,R.string.ot_2_rating,R.drawable.o2));
        loc.add(new LocationInfo(R.string.ot_3_name,R.string.ot_3_des,R.string.ot_3_rating,R.drawable.o3));
        loc.add(new LocationInfo(R.string.ot_4_name,R.string.ot_4_des,R.string.ot_4_rating,R.drawable.o4));
        loc.add(new LocationInfo(R.string.ot_5_name,R.string.ot_5_des,R.string.ot_5_rating,R.drawable.o5));
        loc.add(new LocationInfo(R.string.ot_6_name,R.string.ot_6_des,R.string.ot_6_rating,R.drawable.o6));
        loc.add(new LocationInfo(R.string.ot_7_name,R.string.ot_7_des,R.string.ot_7_rating,R.drawable.o7));
        loc.add(new LocationInfo(R.string.ot_8_name,R.string.ot_8_des,R.string.ot_8_rating,R.drawable.o8));
        loc.add(new LocationInfo(R.string.ot_9_name,R.string.ot_9_des,R.string.ot_9_rating,R.drawable.o9));
        loc.add(new LocationInfo(R.string.ot_10_name,R.string.ot_1_des,R.string.ot_10_rating,R.drawable.o10));
        CoustomAdapter itemsAdapter= new CoustomAdapter(getActivity(),loc);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
