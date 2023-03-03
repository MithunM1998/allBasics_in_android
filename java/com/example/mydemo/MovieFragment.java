package com.example.mydemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class MovieFragment extends Fragment {

    public MovieFragment(){

    }



    public View  onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saved){
        return inflater.inflate(R.layout.fragment_movie,container,false);
    }
}
