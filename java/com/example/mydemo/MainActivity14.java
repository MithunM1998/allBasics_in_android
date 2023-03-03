package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity14 extends AppCompatActivity {
    RatingBar ratingBar;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        button=(Button)findViewById(R.id.button13);
        ratingBar=(RatingBar) findViewById(R.id.ratingBar);

        onClickRatingBar();

    }




    public void onClickRatingBar(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value=String.valueOf(ratingBar.getRating());
                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(getApplicationContext(),MainActivity15.class);
                startActivity(intent);
            }
        });
    }
}