package com.example.mydemo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


public class MainActivity22 extends AppCompatActivity {
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

        //@SuppressLint("MissingInflatedId")

        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewpage);
        ImageAdapter adapterView = new ImageAdapter(this);

            mViewPager.setAdapter(adapterView);



        button=(Button)findViewById(R.id.button22);
      button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity23.class);
                startActivity(intent);
            }
        });

    }


}