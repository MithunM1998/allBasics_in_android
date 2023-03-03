package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {
CheckBox pizza,burger,chats,cake;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        clickOnCheckBox();
    }

    public void clickOnCheckBox(){

        pizza=(CheckBox)findViewById(R.id.checkBox);
        burger=(CheckBox)findViewById(R.id.checkBox2);
        chats=(CheckBox)findViewById(R.id.checkBox3);
        cake=(CheckBox)findViewById(R.id.checkBox4);
        button=(Button)findViewById(R.id.button5);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int totalamount=0;
               StringBuilder str=new StringBuilder();
               if(pizza.isChecked()){
                   str.append("\nPizza 100 RS");
                   totalamount+=100;
               }
               if(burger.isChecked()){
                   str.append("\nBurger 50 RS");
                   totalamount+=50;
               }
               if(chats.isChecked()){
                   str.append("\nchats 25 RS");
                   totalamount+=25;
               }
               if (cake.isChecked()){
                   str.append("\ncake 30 RS");
                   totalamount+=30;
               }
               str.append("\ntotal amount :"+totalamount+"Rs");

               Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG).show();

               Intent intent=new Intent(getApplicationContext(),MainActivity7.class);
               startActivity(intent);
           }
       });
    }
}