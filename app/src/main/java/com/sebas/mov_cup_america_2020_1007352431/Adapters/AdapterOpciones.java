package com.sebas.mov_cup_america_2020_1007352431.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sebas.mov_cup_america_2020_1007352431.R;
import com.sebas.mov_cup_america_2020_1007352431.model.Lista;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class AdapterOpciones extends RecyclerView.Adapter<AdapterOpciones.AdapterViewHolder>{

    private List<Lista> listaDatos;    //lista de obj a utilizar
    private int resource;                   //Layout que modela la info
    private Activity context;               //Donde se implementa el Adapter

    public AdapterOpciones (ArrayList<Lista> listaDatos, int resource, Activity context) {
        this.listaDatos = listaDatos;
        this.resource = resource;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(resource,viewGroup,false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder adapterViewHolder, int i) {
        Lista itemModel = listaDatos.get(i);
        Picasso.get().load(itemModel.getIma1()).into(adapterViewHolder.imagen1);
        Picasso.get().load(itemModel.getIma2()).into(adapterViewHolder.imagen2);

        adapterViewHolder.equi1.setText(itemModel.getEquipo1());
        adapterViewHolder.equi2.setText(itemModel.getEquipo2());
        adapterViewHolder.date.setText(itemModel.getFecha());
    }

    public int getItemCount() {
        return listaDatos.size();
    }


    public class AdapterViewHolder extends RecyclerView.ViewHolder{

       ImageView imagen1;
       ImageView imagen2;
        TextView   equi1;
        TextView   equi2;

        TextView date;


        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            imagen1 = itemView.findViewById(R.id.itemImg);
            imagen2 = itemView.findViewById(R.id.itemImg2);
            equi1 = itemView.findViewById(R.id.itemEquipo1);
            equi2 = itemView.findViewById(R.id.itemEquipo2);
            date = itemView.findViewById(R.id.itemfecha);
        }
    }


}
