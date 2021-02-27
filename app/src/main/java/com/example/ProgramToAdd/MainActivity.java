package com.example.ProgramToAdd;

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

    public void openActivity3(View v){

        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }

    public void openActivity4(View v){

        Intent intent = new Intent(this,Main4Activity.class);
        startActivity(intent);
    }
    public void openActivity5(View v){

        Intent intent = new Intent(this,Main5Activity.class);
        startActivity(intent);
    }
    public void openActivity6(View v){

        Intent intent = new Intent(this,Main6Activity.class);
        startActivity(intent);
    }
}
