package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.MenuItemCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity26 extends AppCompatActivity {
ListView listView;
ArrayList<String> arrayList;
ArrayAdapter<String> adapter;
Button button;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main26);

        listView=(ListView) findViewById(R.id.list5);
        button=(Button) findViewById(R.id.button26);

        arrayList=new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Pineapple");
        arrayList.add("Orange");
        arrayList.add("Lychee");
        arrayList.add("Gavava");
        arrayList.add("Peech");
        arrayList.add("Melon");
        arrayList.add("Watermelon");
        arrayList.add("Papaya");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity27.class);
                startActivity(intent);
            }
        });

    }

    public  boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        MenuItem searchViewItem = menu.findItem(R.id.app_bar_search);
         SearchView searchView = (SearchView) searchViewItem.getActionView() ;
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                searchView.clearFocus();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
              adapter.getFilter().filter(newText);
               return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

}