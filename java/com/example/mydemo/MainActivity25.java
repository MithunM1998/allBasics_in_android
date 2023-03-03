package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity25 extends AppCompatActivity {

    SearchView searchView;
    Button button;
    ListView list;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);

        searchView=(SearchView) findViewById(R.id.searchview);
        button=(Button) findViewById(R.id.button25);
        list=(ListView) findViewById(R.id.list3);

        arrayList=new ArrayList<String>();

        arrayList.add("Java");
        arrayList.add("C++");
        arrayList.add("Hello");
        arrayList.add("HTML");
        arrayList.add("Bangalore");
        arrayList.add("Python");
        arrayList.add("Google");
        arrayList.add("Aeroplane");

        adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);
        list.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @SuppressLint("SuspiciousIndentation")
            @Override
            public boolean onQueryTextSubmit(String query) {
                if(arrayList.contains(query)){
                    adapter.getFilter().filter(query);
                }else
                    Toast.makeText(getApplicationContext(),"No match found",Toast.LENGTH_SHORT).show();
                    return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity26.class);
                startActivity(intent);
            }
        });

    }
}