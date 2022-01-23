package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArkadasActivity extends AppCompatActivity {

    private Button buttonmesaj;
    private Button buttoncikis;
    private Button buttonprofil;

    public void init()
    {
        buttonmesaj=(Button) findViewById(R.id.buttonmesaj);
        buttoncikis=(Button) findViewById(R.id.buttonçıkış);
        buttonprofil=(Button) findViewById(R.id.buttonprofil);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arkadas);
        init();

        buttonmesaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentLogin=new Intent(ArkadasActivity.this, ArkadasActivity.class);
                startActivity(intentLogin);
            }
        });

        buttoncikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRegister=new Intent(ArkadasActivity.this, MainActivity.class);
                startActivity(intentRegister);
            }
        });

        buttonprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRegister=new Intent(ArkadasActivity.this, AnaActivity2.class);
                startActivity(intentRegister);
            }
        });




    }
}