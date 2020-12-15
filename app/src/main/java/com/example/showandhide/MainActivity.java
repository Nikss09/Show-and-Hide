package com.example.showandhide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView textView;

    public void show(View view){
        //textView.setAlpha(1);
        textView.setVisibility(View.VISIBLE);
    }

    public void hide(View view){
        //textView.setAlpha(0);
        textView.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text);
    }
}