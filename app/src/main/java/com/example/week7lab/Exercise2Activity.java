package com.example.week7lab;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class Exercise2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewPets);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Sample pet list (replace images with your own drawables)
        List<Pet> pets = Arrays.asList(
                new Pet("Dog", R.drawable.dog),
                new Pet("Cat", R.drawable.cat),
                new Pet("Duck", R.drawable.duck),
                new Pet("Parrot", R.drawable.parrot),
                new Pet("Hamster", R.drawable.hamster),
                new Pet("Turtle", R.drawable.turtle)
        );

        PetAdapter adapter = new PetAdapter(this, pets);
        recyclerView.setAdapter(adapter);
    }
}
