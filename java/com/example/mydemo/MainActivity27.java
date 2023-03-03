package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity27 extends AppCompatActivity {

    ListView listView;
    EditText editText;
    ArrayAdapter<String> adapter;

    String[] list={"Apple phone","Mi phone","Sony","Redmi","Realme","One plus"};
     Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main27);

        listView=(ListView) findViewById(R.id.listViewtextWacther);
        editText=(EditText) findViewById(R.id.editTextwatcher);
        button=(Button) findViewById(R.id.button27);

        adapter=new ArrayAdapter<String>(this,R.layout.list_item,R.id.productname,list);
        listView.setAdapter(adapter);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Toast.makeText(getApplicationContext(),"Before Text Change",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Toast.makeText(getApplicationContext(),"After Text Change",Toast.LENGTH_SHORT).show();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity28.class);
                startActivity(intent);
            }
        });
    }
}