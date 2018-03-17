package com.srikanth.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view ) { //enter user information in fields
        //find by id the textfield object
        EditText textField_username = (EditText) findViewById(R.id.textField1); //convert from View textfield object to EditText object
        EditText textField_password = (EditText) findViewById(R.id.textField2);
        Log.i("INFO:", textField_username.getText().toString() + " " + textField_password.getText().toString());

        Toast.makeText(MainActivity.this, "Welcome" + " " + textField_username.getText().toString(), Toast.LENGTH_LONG).show(); //android pop-up message
    }

    public void changeImage(View view){ //change picture
    while(true) {
        ImageView image = (ImageView) findViewById(R.id.imageView2);
        image.setImageResource(R.drawable.google2);  //no need for file jpg extension
        
    }
    }


}
