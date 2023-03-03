package com.example.mydemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class SportsFragment extends Fragment {

    public SportsFragment(){

    }

    public View  onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saved){
        return inflater.inflate(R.layout.fragment_sports,container,false);
    }
}
