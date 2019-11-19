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
public class HistoricFragment extends Fragment {


    public HistoricFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.loc_list, container, false);
        ArrayList<LocationInfo> loc=new ArrayList<LocationInfo>();
        loc.add(new LocationInfo(R.string.his_1_name,R.string.his_1_des,R.string.his_1_rating,R.drawable.his1));
        loc.add(new LocationInfo(R.string.his_2_name,R.string.his_2_des,R.string.his_2_rating,R.drawable.his2));
        loc.add(new LocationInfo(R.string.his_3_name,R.string.his_3_des,R.string.his_3_rating,R.drawable.his3));
        loc.add(new LocationInfo(R.string.his_4_name,R.string.his_4_des,R.string.his_4_rating,R.drawable.his4));
        loc.add(new LocationInfo(R.string.his_5_name,R.string.his_5_des,R.string.his_5_rating,R.drawable.his5));
        loc.add(new LocationInfo(R.string.his_6_name,R.string.his_6_des,R.string.his_6_rating,R.drawable.his6));
        loc.add(new LocationInfo(R.string.his_7_name,R.string.his_7_des,R.string.his_7_rating,R.drawable.his7));
        loc.add(new LocationInfo(R.string.his_8_name,R.string.his_8_des,R.string.his_8_rating,R.drawable.his8));
        loc.add(new LocationInfo(R.string.his_9_name,R.string.his_9_des,R.string.his_9_rating,R.drawable.his9));
        loc.add(new LocationInfo(R.string.his_10_name,R.string.his_10_des,R.string.his_10_rating,R.drawable.his10));
        CoustomAdapter itemsAdapter= new CoustomAdapter(getActivity(),loc);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
