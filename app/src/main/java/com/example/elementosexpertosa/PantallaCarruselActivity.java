package com.example.elementosexpertosa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class PantallaCarruselActivity extends AppCompatActivity {

    private ViewPager2 contenedorVista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_carrusel);

        contenedorVista = findViewById(R.id.viewPager);

        //Adaptador para contenedorVista
        Adaptador miAdaptador = new Adaptador();
        contenedorVista.setAdapter(miAdaptador);
    }
}