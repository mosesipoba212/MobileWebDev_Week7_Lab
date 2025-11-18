package com.example.week7lab;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        TextView tvTotal = findViewById(R.id.tvTotal);
        double total = getIntent().getDoubleExtra("TOTAL", 0);
        tvTotal.setText(String.format("Total: £%.2f", total));
    }
}
