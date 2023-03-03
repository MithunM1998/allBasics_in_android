package com.example.mydemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity31 extends AppCompatActivity {
Toolbar toolbar;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main31);
        button=(Button)findViewById(R.id.button31);
        toolbar=(Toolbar) findViewById(R.id.tool);
        try{
            setSupportActionBar(toolbar);
        }catch (IllegalStateException e){
            e.printStackTrace();
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity32.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        switch (id){
            case R.id.itema:
                Toast.makeText(this, "item 1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itemb:
                Toast.makeText(this, "item 2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itemc:
                Toast.makeText(this, "item 3", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return  super.onOptionsItemSelected(item);
        }
    }
}