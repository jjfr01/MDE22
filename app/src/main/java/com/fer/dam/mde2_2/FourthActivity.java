package com.fer.dam.mde2_2;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.fer.dam.mde2_2.Adaptadores.RecyclerAdaptador2;
import com.fer.dam.mde2_2.Pojo.Lugares;

import java.util.ArrayList;

public class FourthActivity extends AppCompatActivity {

    Toolbar tb;

    private void init(){

        tb = (Toolbar) findViewById(R.id.tb);
        setSupportActionBar(tb);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        RecyclerView rv = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerAdaptador2 ra2 = new RecyclerAdaptador2(generarDatos(), this);
        rv.setAdapter(ra2);

        rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        init();
    }

    private ArrayList<Lugares> generarDatos(){

        ArrayList<Lugares> arrayL = new ArrayList<Lugares>();

        for(int i = 0;i<20;i++){

            arrayL.add(new Lugares("Lugar"+i, "Descripcion"+i));

        }

        return arrayL;
    }

}
