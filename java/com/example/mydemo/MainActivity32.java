package com.example.mydemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity32 extends AppCompatActivity {
ListView listView;
Button button;
String[] Contacts={"Mithun","Joshi","Virat","Viru","Chiru","Ramu","Hanuman"};
ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main32);

        listView=(ListView) findViewById(R.id.listmenu);
        button=(Button) findViewById(R.id.button32);
        adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Contacts);
        listView.setAdapter(adapter);

        registerForContextMenu(listView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity33.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        menu.setHeaderTitle("Select the Action");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.itemA){
            Toast.makeText(getApplicationContext(),"calling code", Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId()==R.id.itemB){
            Toast.makeText(getApplicationContext(),"sending sms code",Toast.LENGTH_LONG).show();
        }else{
            return false;
        }
        return true;
    }
}
