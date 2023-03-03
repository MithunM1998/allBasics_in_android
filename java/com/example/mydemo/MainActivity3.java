package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
EditText edittext1,edittext2;
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        edittext1=(EditText)findViewById(R.id.editText1);
        edittext2=(EditText) findViewById(R.id.editText2);
        button=(Button) findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=edittext1.getText().toString();
                String b=edittext2.getText().toString();
                int c=Integer.parseInt(a);
                int d=Integer.parseInt(b);
                int sum=c+d;

               Toast toast= Toast.makeText(getApplicationContext(),String.valueOf(sum),Toast.LENGTH_LONG);
               toast.setMargin(50,50);
               toast.show();
                Intent intent=new Intent(getApplicationContext(),MainActivity4.class);
                startActivity(intent);
            }
        });
    }
}