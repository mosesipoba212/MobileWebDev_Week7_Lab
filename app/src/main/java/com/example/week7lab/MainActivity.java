package com.example.week7lab;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnExercise1 = findViewById(R.id.btnExercise1);
        Button btnExercise2 = findViewById(R.id.btnExercise2);
        Button btnExercise3 = findViewById(R.id.btnExercise3);

        btnExercise1.setOnClickListener(v ->
                startActivity(new Intent(this, Exercise1Activity.class)));

        btnExercise2.setOnClickListener(v ->
                startActivity(new Intent(this, Exercise2Activity.class)));

        btnExercise3.setOnClickListener(v ->
                startActivity(new Intent(this, Exercise3Activity.class)));
    }
}
