package com.example.elementosexpertosa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adaptador extends RecyclerView.Adapter<MyViewHolder> {

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                //Se utiliza un INFLATER
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_carrusel, parent, false);
                return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
                holder.bind(position);
        }

        @Override
        public int getItemCount() {
                return 5;
        }
}