package com.example.week7lab;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Exercise1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);

        // Reference to ListView
        ListView listView = findViewById(R.id.listViewGames);

        // Array of your favourite games
        String[] games = {
                "Destiny 2",
                "Final Fantasy XIV",
                "Persona 5 Royal",
                "Elden Ring",
                "Cyberpunk 2077",
                "The Legend of Zelda: Tears of the Kingdom",
                "Hades",
                "Monster Hunter World",
                "Octopath Traveler II",
                "Baldur’s Gate 3"
        };

        // Create and set the adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                games
        );
        listView.setAdapter(adapter);

        // Handle clicks
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedGame = games[position];
                Toast.makeText(
                        Exercise1Activity.this,
                        "You clicked: " + selectedGame,
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}
