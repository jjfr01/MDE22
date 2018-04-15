package com.fer.dam.mde2_2.Adaptadores;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fer.dam.mde2_2.Pojo.Lugares;
import com.fer.dam.mde2_2.R;

import java.util.ArrayList;

public class RecyclerAdaptador extends RecyclerView.Adapter<RecyclerAdaptador.LugaresViewHolder> {

    private ArrayList<Lugares> datos;

    public RecyclerAdaptador(ArrayList<Lugares> datos) {
        this.datos = datos;
    }

    @Override
    public RecyclerAdaptador.LugaresViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false);

        LugaresViewHolder lvh = new LugaresViewHolder(itemView);

        return lvh;
    }

    @Override
    public void onBindViewHolder(RecyclerAdaptador.LugaresViewHolder holder, int position) {

        Lugares lgs = datos.get(position);

        holder.bindLugares(lgs);

    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class LugaresViewHolder extends RecyclerView.ViewHolder{

        private TextView tvNombre, tvDescripcion;


        public LugaresViewHolder(View itemView) {
            super(itemView);
            tvNombre = (TextView) itemView.findViewById(R.id.tvNombre);
            tvDescripcion = (TextView) itemView.findViewById(R.id.tvDescripcion);
        }

        public void bindLugares(Lugares s){
            tvNombre.setText(s.getNombre());
            tvDescripcion.setText(s.getDescripcion());
        }
    }
}
