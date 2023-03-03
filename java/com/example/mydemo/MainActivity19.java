package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity19 extends AppCompatActivity {
    Button button;
    ProgressDialog progressBar;
    private int progressBarStatus=0;
    private Handler progressBarHandler = new Handler();
    private long fileSize = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);

        OnClickdownload();
    }

    public  void OnClickdownload(){
        button=(Button) findViewById(R.id.button18);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar =new ProgressDialog(view.getContext());
                progressBar.setCancelable(true);
                progressBar.setMessage("File downloading....");
                progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progressBar.setProgress(0);
                progressBar.setMax(100);
                progressBar.show();

                progressBarStatus=0;
                fileSize=0;

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (progressBarStatus<100){
                            progressBarStatus=doOperation();

                            try {
                                Thread.sleep(1000);
                            }catch (InterruptedException e){
                                e.printStackTrace();
                            }

                            progressBarHandler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar.setProgress(progressBarStatus);
                                }
                            });
                        }
                        if (progressBarStatus>=100){
                            try {
                                Thread.sleep(1000);
                            }catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            progressBar.dismiss();
                        }
                    }
                }).start();

                Intent intent=new Intent(getApplicationContext(),MainActivity20.class);
                startActivity(intent);
            }
        });
    }

    public  int  doOperation(){
        while(fileSize<=10000){
            fileSize++;
            if(fileSize==1000){
                return 10;
            }else
            if (fileSize==2000){
                return 20;
            }else
            if (fileSize==3000){
                return 30;
            }else
            if (fileSize==4000){
                return 40;
            }else
            if (fileSize==5000){
                return 50;
            }
        }
        return 100;
    }
}