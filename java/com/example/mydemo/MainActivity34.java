package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.mydemo.databinding.ActivityMain13Binding;
import com.example.mydemo.databinding.ActivityMain34Binding;

public class MainActivity34 extends AppCompatActivity {
CheckBox item1,item2,item3,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16,item17,item18,item19;
Button button;

    ActivityMain34Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMain34Binding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main34);

       button=(Button) findViewById(R.id.button34);
        item1=(CheckBox) findViewById(R.id.checkboxA);
        item2=(CheckBox) findViewById(R.id.checkboxB);
        item3=(CheckBox) findViewById(R.id.checkboxC);
        item4=(CheckBox) findViewById(R.id.checkboxD);
        item5=(CheckBox) findViewById(R.id.checkboxE);
        item6=(CheckBox) findViewById(R.id.checkboxF);
        item7=(CheckBox) findViewById(R.id.checkboxG);
        item8=(CheckBox) findViewById(R.id.checkboxH);
        item9=(CheckBox) findViewById(R.id.checkboxI);
        item10=(CheckBox) findViewById(R.id.checkboxJ);
        item11=(CheckBox) findViewById(R.id.checkboxK);
        item12=(CheckBox) findViewById(R.id.checkboxL);
        item13=(CheckBox) findViewById(R.id.checkboxM);
        item14=(CheckBox) findViewById(R.id.checkboxN);
        item15=(CheckBox) findViewById(R.id.checkboxO);
        item16=(CheckBox) findViewById(R.id.checkboxP);
        item17=(CheckBox) findViewById(R.id.checkboxQ);
        item18=(CheckBox) findViewById(R.id.checkboxR);
        item19=(CheckBox) findViewById(R.id.checkboxS);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count=0;
                StringBuilder res=new StringBuilder();
                res.append("Selected Items:");
                if (item1.isChecked()){
                    count+=1;
                }
                if (item2.isChecked()){
                    count++;
                }
                if (item3.isChecked()){
                    count++;
                }
                if (item4.isChecked()){
                    count++;
                }
                if (item5.isChecked()){
                    count++;
                }
                if (item6.isChecked()){
                    count++;
                }
                if (item7.isChecked()){
                    count++;
                }
                if (item8.isChecked()){
                    count++;
                }
                if (item9.isChecked()){
                    count++;
                }
                if (item10.isChecked()){
                    count++;
                }
                if (item11.isChecked()){
                    count++;
                }
                if (item12.isChecked()){
                    count++;
                }
                if (item13.isChecked()){
                    count++;
                } if (item14.isChecked()){
                    count++;
                } if (item15.isChecked()){
                    count++;
                } if (item16.isChecked()){
                    count++;
                }
                if (item17.isChecked()){
                    count++;
                } if (item18.isChecked()){
                    count++;
                }
                if (item19.isChecked()){
                    count++;
                }

                res.append("\nTotal: ").append(count);
                //Displaying the message on the toast
                Toast.makeText(getApplicationContext(), res.toString(), Toast.LENGTH_LONG).show();



            }
        });


    }
}