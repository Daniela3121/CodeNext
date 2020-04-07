package com.example.diseasesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView appNmae;
    TextView respiratory;
    TextView cardio;
    TextView bacvir;
    TextView mental;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appNmae=findViewById(R.id.appTitle);
        respiratory=findViewById(R.id.respiratory);
        cardio=findViewById(R.id.cardio);
        bacvir=findViewById(R.id.bacterial);
        mental=findViewById(R.id.mental);

        respiratory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 goToRespiratory();
            }
        });

        cardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToCardio();
            }
        });
        bacvir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToBacterial();
            }
        });
        mental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            goToMental();
            }
        });
    }
    public void goToRespiratory(){
        Intent toRespiratory=new Intent(this,respiratory.class);
        startActivity(toRespiratory);
    }

    public void goToCardio(){
        Intent toCardio=new Intent(this, cardio.class);
        startActivity(toCardio);
    }
    public void goToBacterial(){
        Intent toBacterial=new Intent(this, bacterial.class);
        startActivity(toBacterial);
    }
    public void goToMental(){
        Intent toMental=new Intent(this,mental.class);
        startActivity(toMental);
    }
}
