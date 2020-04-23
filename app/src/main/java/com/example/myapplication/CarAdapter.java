package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarViewHolder> {
    ArrayList<Car> cars;

    public CarAdapter(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public class CarViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView desc;

        public CarViewHolder(View view) {
            super(view);
            img = view.findViewById(R.id.car);
            desc = view.findViewById(R.id.desc);
        }
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_2, parent, false);
        return new CarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        holder.desc.setText(cars.get(position).getDesc());
        holder.img.setImageResource(cars.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return cars.size();
    }


}
