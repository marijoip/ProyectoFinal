package com.example.proyectofinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Numeros extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numeros_main);

    }

    public void ColoresIntent(View view) {
        Intent a = new Intent(Numeros.this,Colores.class);
        startActivity(a);
        finish();
    }

    public void AnimalesIntent(View view) {
        Intent a = new Intent(Numeros.this,Colores.class);
        startActivity(a);
        finish();
    }


    public void AbecedarioIntent(View view) {
        Intent a = new Intent(Numeros.this,Abecedario.class);
        startActivity(a);
        finish();
    }

    public void pcuerpoIntent(View view) {
        Intent a = new Intent(Numeros.this,P_Cuerpo.class);
        startActivity(a);
        finish();
    }

    public void PComunesIntent(View view) {
        Intent a = new Intent(Numeros.this,P_Comunes.class);
        startActivity(a);
        finish();



    }
}


