package com.example.elementosexpertosa;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class MyViewHolder extends RecyclerView.ViewHolder {


    private ImageView imageView;
    private TextView textView;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        textView = itemView.findViewById(R.id.textView);
    }

    public void bind(int position) {
        // Configura los elementos con datos según la posición
        switch (position) {
            case 0:
                imageView.setImageResource(R.drawable.perrito_uno);
                textView.setText("Perrito uno");
                break;
            case 1:
                imageView.setImageResource(R.drawable.perrito_dos);
                textView.setText("Perrito dos");
                break;
            case 2:
                imageView.setImageResource(R.drawable.perrito_tres);
                textView.setText("Perrito tres");
                break;
            case 3:
                imageView.setImageResource(R.drawable.perrito_cuatro);
                textView.setText("Perrito cuatro");
                break;
            case 4:
                imageView.setImageResource(R.drawable.perrito_cinco);
                textView.setText("Perrito cinco");
                break;
        }
    }
}
