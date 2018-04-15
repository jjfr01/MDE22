package com.fer.dam.mde2_2;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab1, fab2;
    EditText et, et2;
    Button btn;
    TextInputLayout til;



    private void init(){

        fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        et = (EditText) findViewById(R.id.et);
        et2 = (EditText) findViewById(R.id.et2);
        btn = (Button) findViewById(R.id.btn);
        til = (TextInputLayout) findViewById(R.id.til);

        event();

    }


    private void event(){

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Prueba", "Hola");
                startActivity(intent);*/

                /*Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                Bundle b = new Bundle();
                b.putString("Prueba", "Hola");
                intent.putExtras(b);
                startActivity(intent);*/

                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent);

            }
        });

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                Bundle b = new Bundle();
                b.putString("Prueba", "Hola");
                intent.putExtras(b);
                startActivity(intent);

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comprobarText();
                launchDialog();

            }
        });



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();



    }

    private void comprobarText(){

        if(et.length()>20){

            et.setError("Límite Excedido");
            //et2.setError("Prueba");
            //til.setError("Límite Excedido");


        } else {


        }


    }

    private void launchDialog(){

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        LayoutInflater li = this.getLayoutInflater();
        AlertDialog ad;

        alert.setView(li.inflate((R.layout.alert1), null));

        alert.setTitle(R.string.titleDialog);

        /*CharSequence lista[] = {"Mostrar Contraseña", "Mostrar Opciones Avanzadas"};
        boolean control[] = new boolean[lista.length];

        alert.setMultiChoiceItems(lista, control, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {

            }
        });*/

        /*alert.setPositiveButton(R.string.btn3, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        alert.setNegativeButton(R.string.btn2, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });*/

        ad = alert.create();
        ad.show();

    }

}
