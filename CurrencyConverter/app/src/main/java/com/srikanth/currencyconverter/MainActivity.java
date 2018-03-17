package com.srikanth.currencyconverter;
import android.view.View;
import android.widget.*;
import android.view.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.io.*;
import java.util.*;
import java.util.log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertFunction(View view){
    EditText dollarAm = (EditText)findViewById(R.id.dollarAmount);
    Double x = Double.parseDouble(dollarAm.getText().toString());
    Double y = x*0.75;

    EditText results = (EditText)findViewById(R.id.results);
    results.setText(String.format("%.2f", y));
    //Toast.makeText(MainActivity.this, "USD" + " " + String.format("%.2f", y), Toast.LENGTH_SHORT).show();
        Log.i("info", "msg");

    }
}
