package com.example.week7lab;

public class Console {
    private String name;
    private int imageResId;
    private double price;
    private int quantity;

    public Console(String name, int imageResId, double price) {
        this.name = name;
        this.imageResId = imageResId;
        this.price = price;
        this.quantity = 0;
    }

    public String getName() { return name; }
    public int getImageResId() { return imageResId; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
