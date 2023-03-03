package com.example.mydemo;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.core.app.BundleCompat;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment  {

    public HomeFragment(){

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saved){
        return inflater.inflate(R.layout.fragment_home,container,false);
    }
}
