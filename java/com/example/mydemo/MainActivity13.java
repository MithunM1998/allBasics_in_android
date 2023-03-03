package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mydemo.databinding.ActivityMain13Binding;

import java.util.Locale;

public class MainActivity13 extends AppCompatActivity {
  ActivityMain13Binding binding;
   // ListView listView;
    //Button button;
    String[] Title={"Title1","Title2","Title3","Title4"};
    String[] subtitle={"subtitle1","subtitle2","subtitle3","subtitle4"};
    Integer[] imgId={R.drawable.facebook_logo,R.drawable.youtube_logo,R.drawable.nstagramlogo,R.drawable.twitter_logo_png};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain13Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
      //  button=(Button)findViewById(R.id.button11);
        MyListAdapter adapter=new MyListAdapter(this,Title,subtitle,imgId);
       // listView=(ListView) findViewById(R.id.list2);
        binding.list2.setAdapter(adapter);

        binding.list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value= (String) adapter.getItem(i);
                Toast.makeText(getApplicationContext(),value.toString(),Toast.LENGTH_SHORT).show();
            }
        });
        nextActivity();
    }

    public void nextActivity(){
    binding.button11.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getApplicationContext(),MainActivity14.class);
            startActivity(intent);
        }
    });
    }
}