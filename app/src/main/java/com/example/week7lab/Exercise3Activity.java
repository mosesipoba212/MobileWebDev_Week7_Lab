package com.example.week7lab;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Exercise3Activity extends AppCompatActivity {

    private List<Console> consoleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise3);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewConsoles);
        Button btnAddToCart = findViewById(R.id.btnAddToCart);

        consoleList = new ArrayList<>();
        consoleList.add(new Console("PlayStation 5", R.drawable.ps5, 499.99));
        consoleList.add(new Console("Xbox Series X", R.drawable.xbox, 479.99));
        consoleList.add(new Console("Nintendo Switch", R.drawable.switch_console, 299.99));
        consoleList.add(new Console("Steam Deck", R.drawable.steamdeck, 399.99));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ConsoleAdapter(this, consoleList));

        btnAddToCart.setOnClickListener(v -> {
            double total = 0;
            for (Console c : consoleList) {
                total += c.getQuantity() * c.getPrice();
            }

            Intent intent = new Intent(this, CartActivity.class);
            intent.putExtra("TOTAL", total);
            startActivity(intent);
        });
    }
}
