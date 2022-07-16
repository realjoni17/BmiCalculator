package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


public void bmi(View view){
    double height = 0;
    double weight = 0;
    double bms = 0;
    String msg = "";

    EditText et1 = (EditText) findViewById(R.id.Weight);
    EditText et2 = (EditText) findViewById(R.id.Height);

     Button b1 = (Button) findViewById(R.id.button);

     TextView t1 = (TextView) findViewById(R.id.textView);
     TextView t2 = (TextView) findViewById(R.id.textView2);

    weight = Double.parseDouble(et1.getText().toString());
    height = Double.parseDouble(et2.getText().toString());

    bms = height * height;
    bms = weight / bms;
    t1.setText(String.valueOf(bms));
    if (bms < 18.5) {
        msg="Under Weight";
    }
    else if(bms>18.5 && bms<25)
    {
        msg="Normal";
    }
    else if(bms>25)
    {
        msg="OverWeight";
    }
    t2.setText(msg);
}

    }


