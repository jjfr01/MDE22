package com.fer.dam.mde2_2.Adaptadores;


import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.fer.dam.mde2_2.Pojo.Lugares;
import com.fer.dam.mde2_2.R;

import java.util.ArrayList;

public class RecyclerAdaptador2 extends RecyclerView.Adapter<RecyclerAdaptador2.LugaresViewHolder> {

    private ArrayList<Lugares> datos;
    private Context context;

    public RecyclerAdaptador2(ArrayList<Lugares> datos) {
        this.datos = datos;
    }

    public RecyclerAdaptador2(ArrayList<Lugares> datos, Context context) {
        this.datos = datos;
        this.context = context;
    }

    @Override
    public RecyclerAdaptador2.LugaresViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler2, parent, false);

        LugaresViewHolder lvh = new LugaresViewHolder(itemView);

        return lvh;
    }

    @Override
    public void onBindViewHolder(RecyclerAdaptador2.LugaresViewHolder holder, int position) {

        Lugares lgs = datos.get(position);

        //holder.bindLugares(lgs);

        holder.bindLugares2(lgs, context);

    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class LugaresViewHolder extends RecyclerView.ViewHolder{

        private TextView tvNombre, tvDescripcion;
        private CardView cv1;


        public LugaresViewHolder(View itemView) {
            super(itemView);
            tvNombre = (TextView) itemView.findViewById(R.id.tvNombre);
            tvDescripcion = (TextView) itemView.findViewById(R.id.tvDescripcion);
            cv1 = (CardView) itemView.findViewById(R.id.cv1);
        }

        public void bindLugares(Lugares s){
            tvNombre.setText(s.getNombre());
            tvDescripcion.setText(s.getDescripcion());

        }

        public void bindLugares2(final Lugares s, final Context context){
            tvNombre.setText(s.getNombre());
            tvDescripcion.setText(s.getDescripcion());

            tvDescripcion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, ""+s.getDescripcion(), Toast.LENGTH_LONG).show();
                }
            });

            cv1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, "Card: "+s.getNombre(), Toast.LENGTH_LONG).show();
                }
            });

        }
    }
}
