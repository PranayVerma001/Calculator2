package com.example.ProgramToAdd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity3 extends AppCompatActivity {

    EditText f;
    EditText s;
    TextView r;
    double num1,num2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        f = (EditText) findViewById(R.id.first);
        s = (EditText) findViewById(R.id.second);
        r = (TextView) findViewById(R.id.result);
    }

    public void cal(View v){

        num1 = Double.parseDouble(f.getText().toString());
        num2 = Double.parseDouble(s.getText().toString());
        result = num1+num2;
        r.setText(Double.toString(result));
    }
}
