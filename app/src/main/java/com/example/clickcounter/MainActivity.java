package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button plusz;
private TextView text;
private Button minusz;
private int szam;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        text.setText("0");
        text.setTextColor(Color.rgb(0,0,255));


        plusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            szam++;
                System.out.println(szam);
            }
        });
        minusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szam--;
                System.out.println(szam);
            }
        });
        if(szam>0){
            text.setTextColor(Color.rgb(0,255,0));
        }else{
            text.setTextColor(Color.rgb(255,0,0));
        }

    }private void init(){
        text=findViewById(R.id.text);
        plusz=findViewById(R.id.plusz);
        minusz=findViewById(R.id.minusz);
        szam=0;
    }
}