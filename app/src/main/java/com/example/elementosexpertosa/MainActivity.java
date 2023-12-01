package com.example.elementosexpertosa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botonMenuDesplegable=(Button) findViewById(R.id.botonMenu);

        Button botonFlecha=(Button)findViewById(R.id.botonFlecha);
        botonFlecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallaCarrusel=new Intent(MainActivity.this, PantallaCarruselActivity.class);
                startActivity(pantallaCarrusel);
            }
        });

        botonMenuDesplegable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu miChiquiMenu=new PopupMenu(MainActivity.this, v);
                miChiquiMenu.getMenuInflater().inflate(R.menu.menu_desplegable, miChiquiMenu.getMenu());

                miChiquiMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if(item.getItemId()==R.id.pag1){
                            //Intent....
                            return true;
                        }else if(item.getItemId()==R.id.pag2){

                        }else if(item.getItemId()==R.id.pag3){

                        }

                        return false;
                    }
                });
                miChiquiMenu.show();
            }
        });




        /*FRAGMENTO*/
        BlankFragment miPrimerFragmento = new BlankFragment();
        //Obtener el FragmentManager
        FragmentManager manager= getSupportFragmentManager();
        FragmentTransaction transaction= manager.beginTransaction();
        //Reemplazamos el contenedor por el fragmento
        transaction.replace(R.id.contenedorFragmento, miPrimerFragmento);
        //Confirmamos
        transaction.commit();



        /*FRAGMENTO 2*/


        BlankFragment2 miSegundoFragmento = new BlankFragment2();
        FragmentManager manager2 = getSupportFragmentManager();
        FragmentTransaction transaction2 = manager2.beginTransaction();
        transaction2.replace(R.id.contenedorFragmento2, miSegundoFragmento);
        transaction2.commit();
    }
}