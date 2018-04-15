package com.fer.dam.mde2_2;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.fer.dam.mde2_2.Adaptadores.RecyclerAdaptador;
import com.fer.dam.mde2_2.Pojo.Lugares;

import java.util.ArrayList;

public class ThirdActivity extends AppCompatActivity {

    Toolbar tb;
    FloatingActionButton fab1;

    private void init() {

        tb = (Toolbar) findViewById(R.id.tb);
        setSupportActionBar(tb);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        RecyclerView rv = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerAdaptador ra = new RecyclerAdaptador(generarDatos());
        rv.setAdapter(ra);

        rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(rv.getContext(), LinearLayoutManager.VERTICAL);
        rv.addItemDecoration(dividerItemDecoration);

        events();

    }

    private void events(){

        fab1 = (FloatingActionButton) findViewById(R.id.fab1);

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);
                startActivity(intent);

            }
        });



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
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
