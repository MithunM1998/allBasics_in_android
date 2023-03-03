package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {
RadioGroup rd;
RadioButton gender;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        radioButton();
    }

    public void radioButton(){
        rd=(RadioGroup) findViewById(R.id.radiogroup);
        button=(Button) findViewById(R.id.button7);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId=rd.getCheckedRadioButtonId();
                gender=(RadioButton)findViewById(selectedId);

                if(selectedId==-1){
                    Toast.makeText(getApplicationContext(),"Nothing as selected",Toast.LENGTH_LONG).show();
                }else
                    Toast.makeText(getApplicationContext(),gender.getText(),Toast.LENGTH_LONG).show();

                Intent intent=new Intent(getApplicationContext(),MainActivity9.class);
                startActivity(intent);
            }
        });

    }
}