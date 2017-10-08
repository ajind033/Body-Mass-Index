package com.example.akash.bmiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    EditText height1, weight1;
    TextView bmi1,res1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        height1 = (EditText) findViewById(R.id.heightInput);
        weight1 = (EditText) findViewById(R.id.weightInput);

        bmi1 = (TextView) findViewById(R.id.urBMI);
        res1 = (TextView) findViewById(R.id.urResult);


    }
    public void calBMI(View view){

        Double height = 0.0,weight = 0.0,bmi = 0.0;
        String res;

        height = Double.parseDouble(height1.getText().toString());
        weight = Double.parseDouble(weight1.getText().toString());

         bmi = (weight * 10000) /  (height * height);

        bmi1.setText(bmi.toString());

        if( bmi < 18.5) {
            res = "Underweight";
        }
        else if ((bmi < 25) && (bmi > 18.5)) {
            res = "Normal";
        }
        else {
            res = "Overweight";
        }
        res1.setText(res);
    }
}
