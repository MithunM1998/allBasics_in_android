package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mydemo.databinding.ActivityMain34Binding;
import com.example.mydemo.databinding.ActivityMain35Binding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity35 extends AppCompatActivity  {
    ActivityMain35Binding binding;
    List<Myclass> mList;
    CheckBoxAdapter checkBoxAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMain35Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mList=new ArrayList<Myclass>();
        /*mList.add(new Myclass("Linux"));
        mList.add(new Myclass("Windows7"));
        mList.add(new Myclass("Java"));
        mList.add(new Myclass("Eclipse"));
        mList.add(new Myclass("Ubuntu"));
        mList.add(new Myclass("MI"));
        mList.add(new Myclass("Android"));
        mList.add(new Myclass("iPhone"));
        mList.add(new Myclass("JavaEE"));
        mList.add(new Myclass(".Net"));
        mList.add(new Myclass("C"));
        mList.add(new Myclass("C++"));
        mList.add(new Myclass("C#"));
        mList.add(new Myclass("HTML"));
        mList.add(new Myclass("CSS"));
        mList.add(new Myclass("JavaScript"));
        mList.add(new Myclass("Json"));
        mList.add(new Myclass("Devops"));*/

        for (int i=0;i<25;i++){
            mList.add(new Myclass("Item"+i));
        }


        checkBoxAdapter=new CheckBoxAdapter(this,mList);
        binding.listA.setAdapter(checkBoxAdapter);

        binding.button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox checkBox=(CheckBox) findViewById(R.id.checkBox);
                //int count=0;
                StringBuilder res=new StringBuilder();
                res.append("Selected Items:");




                res.append("\nTotal: ").append(checkBoxAdapter.counter());
                //Displaying the message on the toast
                Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();



            }
        });
    }


}