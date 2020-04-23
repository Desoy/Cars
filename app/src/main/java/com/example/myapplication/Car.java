package com.example.myapplication;

public class Car {
    private int img;
    private String description;

    public Car(int img, String description) {
        this.img = img;
        this.description = description;

    }

    public int getImg() {
        return this.img;
    }

    public String getDesc() {
        return this.description;
    }
}
