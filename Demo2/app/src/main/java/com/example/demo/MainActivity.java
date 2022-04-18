package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.datnlt.testlib.Calculator;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int res= new Calculator().Sum(15,12);
        Toast.makeText(this,String.valueOf(res),Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_main);
    }
}