package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity15 extends AppCompatActivity {
        Button button;
        WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        webView=(WebView) findViewById(R.id.webView);
        button=(Button) findViewById(R.id.button14);

        //webView.loadUrl("https://www.javatpoint.com/");

         String data = "<html><body><h1>Hello, Javatpoint!</h1></body></html>";
        webView.loadData(data, "text/html", "UTF-8");

        //mywebview.loadUrl("file:///android_asset/myresource.html");

        nextActivity();
    }

    public void nextActivity(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity16.class);
                startActivity(intent);
            }
        });
    }
}