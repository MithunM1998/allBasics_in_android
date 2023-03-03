package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity17 extends AppCompatActivity {
    DatePicker datePicker;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        datePicker=(DatePicker) findViewById(R.id.datePicker);
        button=(Button) findViewById(R.id.button16);
        textView=(TextView) findViewById(R.id.textView9);

        textView.setText("Current Text:"+getCurrentDate());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("changed date:"+getCurrentDate());

                Intent intent=new Intent(getApplicationContext(),MainActivity18.class);
                startActivity(intent);
            }
        });

    }

    public String getCurrentDate(){
        StringBuilder date=new StringBuilder();
        date.append(datePicker.getMonth()+1+"/");
        date.append(datePicker.getDayOfMonth()+"/");
        date.append(datePicker.getYear());

        return date.toString();
    }
}