package com.srikanth.guessingnumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.widget.EditText;

import java.util.*;



public class MainActivity extends AppCompatActivity {

    int x;

    public void makeToast(String string){
        Toast.makeText(MainActivity.this, "string", Toast.LENGTH_LONG).show();}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        x = rand.nextInt(100) + 1;

    }

//    public void startFunction() {
//
//        Toast.makeText(MainActivity.this, "Guess a Number between" + " " + z.toString() + " and " + y.toString(), Toast.LENGTH_LONG).show();
//
//    }


    public void guessFunction(View view) {
        EditText guessEditText = (EditText) findViewById(R.id.guess);

        int guessInt = Integer.parseInt(guessEditText.getText().toString());

        if (guessInt > x) {

            Toast.makeText(MainActivity.this, "Lower!", Toast.LENGTH_LONG).show();


        } else if (guessInt < x) {

            Toast.makeText(MainActivity.this, "Higher!", Toast.LENGTH_LONG).show();

        } else {

            Toast.makeText(MainActivity.this, "Right!", Toast.LENGTH_LONG).show();


            Toast.makeText(MainActivity.this, "You can play again", Toast.LENGTH_LONG).show();
            Random rand = new Random();
            x = rand.nextInt(100) + 1;
        }

    }

}