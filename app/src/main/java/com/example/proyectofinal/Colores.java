package com.example.proyectofinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Colores extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colores_main);


    }

    public void AnimalesIntent(View view) {
        Intent a = new Intent(Colores.this,MainActivity.class);
        startActivity(a);
        finish();
    }

    public void NumerosIntent(View view) {
        Intent a = new Intent(Colores.this,Numeros.class);
        startActivity(a);
        finish();
    }

    public void AbecedarioIntent(View view) {
        Intent a = new Intent(Colores.this,Abecedario.class);
        startActivity(a);
        finish();
    }

    public void pcuerpoIntent(View view) {
        Intent a = new Intent(Colores.this,P_Cuerpo.class);
        startActivity(a);
        finish();
    }

    public void   PComunesIntent(View view) {
        Intent a = new Intent(Colores.this,P_Comunes.class);
        startActivity(a);
        finish();


    }
}

