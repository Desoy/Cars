package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Car> cars = new ArrayList<Car>();

        cars.add(new Car(R.drawable.audi, "AUDI "));
        cars.add(new Car(R.drawable.bmw, "BMW "));
        cars.add(new Car(R.drawable.mercedes, "Mercedes"));
        cars.add(new Car(R.drawable.honda, "Honda"));
        cars.add(new Car(R.drawable.nissan, "Nissan"));
        cars.add(new Car(R.drawable.ford, "Ford"));
        cars.add(new Car(R.drawable.lada, "Lada"));
        cars.add(new Car(R.drawable.opel, "Opel"));
        cars.add(new Car(R.drawable.dodge, "Dodge"));
        cars.add(new Car(R.drawable.lexus, "Lexus"));


        CarAdapter carAdapter = new CarAdapter(cars);
        recyclerView.setAdapter(carAdapter);


    }
}
