package com.example.mydemo;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.constraintlayout.utils.widget.MockView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class MyAdapter extends FragmentPagerAdapter {
    Context context;
   int totaltabs=0;
   int behavior;
    List<String> mItemlist;
    public MyAdapter( Context context,FragmentManager fm) {
        super(fm);
        this.context=context;
        //this.totaltabs=totalstabs;
       // this.behavior=behavior;
        //this.mItemlist=list;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                HomeFragment hm=new HomeFragment();
                return hm;
            case 1:
                SportsFragment sm=new SportsFragment();
                return sm;
            case 2:
                MovieFragment mm=new MovieFragment();
                return mm;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return totaltabs;
    }
}
