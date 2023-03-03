package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity5 extends AppCompatActivity {
ToggleButton toggleButton1,toggleButton2;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        addClickOnToogleButton();
    }

    public void addClickOnToogleButton(){
    toggleButton1=(ToggleButton) findViewById(R.id.toggleButton);
    toggleButton2=(ToggleButton) findViewById(R.id.toggleButton2);
    button=(Button) findViewById(R.id.button);

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            StringBuilder str=new StringBuilder();
            str.append("Toggle1:").append(toggleButton1.getText());
            str.append("Toggle2:").append(toggleButton2.getText());

            Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG).show();

            Intent intent=new Intent(getApplicationContext(),MainActivity6.class);
            startActivity(intent);
        }
    });
    }
}