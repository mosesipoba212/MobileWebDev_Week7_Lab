package com.example.week7lab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ConsoleAdapter extends RecyclerView.Adapter<ConsoleAdapter.ViewHolder> {

    private final Context context;
    private final List<Console> consoleList;

    public ConsoleAdapter(Context context, List<Console> consoleList) {
        this.context = context;
        this.consoleList = consoleList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.console_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Console console = consoleList.get(position);
        holder.consoleName.setText(console.getName());
        holder.consolePrice.setText("£" + console.getPrice());
        holder.consoleImage.setImageResource(console.getImageResId());

        // Spinner setup
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                context,
                R.array.quantity_array,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        holder.spinnerQuantity.setAdapter(adapter);

        holder.spinnerQuantity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                int qty = Integer.parseInt(parent.getItemAtPosition(pos).toString());
                console.setQuantity(qty);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });
    }

    @Override
    public int getItemCount() {
        return consoleList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView consoleImage;
        TextView consoleName, consolePrice;
        Spinner spinnerQuantity;

        ViewHolder(View itemView) {
            super(itemView);
            consoleImage = itemView.findViewById(R.id.consoleImage);
            consoleName = itemView.findViewById(R.id.consoleName);
            consolePrice = itemView.findViewById(R.id.consolePrice);
            spinnerQuantity = itemView.findViewById(R.id.spinnerQuantity);
        }
    }
}
