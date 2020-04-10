package com.example.college;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void cse(View v){
        Intent i= new Intent(MainActivity.this,CSE.class);
        i.putExtra("name","pgf")
        startActivity(i);
    }
    public void eee(View v){

    }
    public void civil(View v){

    }
    public void mech(View v){

    }
}
