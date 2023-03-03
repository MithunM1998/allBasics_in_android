package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {
CheckBox checkBox1,checkBox2;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        customCheckBox();
    }

    public void customCheckBox(){
        checkBox1=(CheckBox)findViewById(R.id.checkBox5);
        checkBox1=(CheckBox) findViewById(R.id.checkBox6);
        button=(Button) findViewById(R.id.button6);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder str=new StringBuilder();
                if(checkBox1.isChecked()){
                    str.append("check box 1");
                }

                try {
                    if(checkBox2.isChecked()){
                        str.append("Checkbox 2");
                    }
                }catch (NullPointerException e){

                }


                Toast.makeText(getApplicationContext(),str.toString(),Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(getApplicationContext(),MainActivity8.class);
                    startActivity(intent);
            }
        });
    }
}