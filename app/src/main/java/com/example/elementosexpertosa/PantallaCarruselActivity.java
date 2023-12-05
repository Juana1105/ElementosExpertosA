package com.example.elementosexpertosa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import java.util.HashSet;
import java.util.Set;

public class PantallaCarruselActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager2 contenedorVista;
    private com.google.android.material.button.MaterialButton boton;
    private Set<String> perritos= new HashSet<String>();
    private boolean[] checked = {false,false,false,false,false};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_carrusel);

        contenedorVista = findViewById(R.id.viewPager);

        //Adaptador para contenedorVista
        Adaptador miAdaptador = new Adaptador();
        contenedorVista.setAdapter(miAdaptador);
        boton= findViewById(R.id.botonCarrusel);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Elige tus perritos lindos favoritos");
        String[] participantes = {"Perrito lindo 1", "Perrito lindo 2", "Perrito lindo 3", "Perrito lindo 4", "Perrito lindo 5"};
        builder.setMultiChoiceItems(participantes, checked, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                if (isChecked){
                    perritos.add(participantes[which]);
                    checked[which]=true;
                }
                else{
                    perritos.remove(participantes[which]);
                    checked[which]=false;
                }

            }
        });
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();

    }
}