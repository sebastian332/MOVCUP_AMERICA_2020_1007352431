package com.sebas.mov_cup_america_2020_1007352431;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.sebas.mov_cup_america_2020_1007352431.Adapters.AdapterOpciones;
import com.sebas.mov_cup_america_2020_1007352431.model.Lista;

import java.util.ArrayList;
import java.util.List;

public class Opciones extends AppCompatActivity {
    List<Lista> listaDatos;
    AdapterOpciones adapterOpciones;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);

        listaDatos = new ArrayList<>();
        llenarListaDatos();
        recyclerView = findViewById(R.id.opcRecicler);
        adapterOpciones = new AdapterOpciones((ArrayList<Lista>) listaDatos,R.layout.item,this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterOpciones); //como implementamos a la lista (Recycler) nuestro adaptador
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapterOpciones.notifyDataSetChanged(); //se actualiza el adaptador

        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss(view);
            }
        });

    }
    public  void llenarListaDatos(){
        listaDatos.add(new Lista("https://upload.wikimedia.org/wikipedia/commons/f/fc/Flag_of_Mexico.svg","MEXICO","BRAZIL","http://is2.4chan.org/int/1562716523211.png","11 DE ABRIL"));
        listaDatos.add(new Lista("https://upload.wikimedia.org/wikipedia/commons/f/fc/Flag_of_Mexico.svg","COLOMBIA","ECUADOR","http://is2.4chan.org/int/1562716523211.png","11 DE ABRIL"));
        listaDatos.add(new Lista("https://upload.wikimedia.org/wikipedia/commons/f/fc/Flag_of_Mexico.svg","ARGENTINA","VENEZUELA","http://is2.4chan.org/int/1562716523211.png","13 DE ABRIL"));
        listaDatos.add(new Lista("https://upload.wikimedia.org/wikipedia/commons/f/fc/Flag_of_Mexico.svg","PERU","PARAGUAY","http://is2.4chan.org/int/1562716523211.png","13 DE ABRIL"));


    }
    public  void ss (View view){

        Toast.makeText(this, "vamos", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Partidos.class);
        startActivity(intent);
    }

}
