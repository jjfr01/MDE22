package com.fer.dam.mde2_2;


import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;


public class SecondActivity extends AppCompatActivity {

    Toolbar tb;

    private void init() {
        tb = (Toolbar) findViewById(R.id.tb);
        setSupportActionBar(tb);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        init();

        Bundle b = getIntent().getExtras();
        if (b != null) {

            String recoger = b.getString("Prueba");
            Toast.makeText(SecondActivity.this, recoger, Toast.LENGTH_LONG).show();

        } else {

            Toast.makeText(SecondActivity.this, "No hay datos desde la otra Activity", Toast.LENGTH_LONG).show();

        }

    }
}
