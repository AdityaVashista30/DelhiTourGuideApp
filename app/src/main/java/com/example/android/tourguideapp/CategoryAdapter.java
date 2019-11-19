package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position==0){return new HistoricFragment();}
        else if(position==1){return new ResterauntFragment();}
        else if(position==2){return new OtherFragment();}
        else {return new HotelFragment();}
    }

    @Override
    public int getCount() {
        return 4;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {return mContext.getString(R.string.fragment_his);}
        else if (position == 1) {return mContext.getString(R.string.fragment_r);}
        else if (position == 2){return mContext.getString(R.string.fragment_o);}
        else {return mContext.getString(R.string.fragment_h); }}

    }
