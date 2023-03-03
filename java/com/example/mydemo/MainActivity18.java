package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity18 extends AppCompatActivity {

    TimePicker timePicker;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);

        timePicker=(TimePicker) findViewById(R.id.timePicker);
        textView=(TextView) findViewById(R.id.textView10);
        button=(Button) findViewById(R.id.button17);

        textView.setText("Current time:"+getCurrentTime());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Changed time:"+getCurrentTime());

                Intent intent=new Intent(getApplicationContext(),MainActivity19.class);
                startActivity(intent);
            }
        });
    }

    public String getCurrentTime(){
        String res=timePicker.getHour()+":"+timePicker.getMinute();
        return res;
    }
}