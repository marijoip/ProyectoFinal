package com.example.proyectofinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Abecedario extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abecedario_main);

    }

    public void ColoresIntent(View view) {
        Intent a = new Intent(Abecedario.this, Colores.class);
        startActivity(a);
    }

    public void AnimalesIntent(View view) {
        Intent a = new Intent(Abecedario.this, MainActivity.class);
        startActivity(a);
    }

    public void NumerosIntent(View view) {
        Intent a = new Intent(Abecedario.this, Numeros.class);
        startActivity(a);
    }


    public void pcuerpoIntent(View view) {
        Intent a = new Intent(Abecedario.this, P_Cuerpo.class);
        startActivity(a);
    }

    public void   PComunesIntent(View view) {
        Intent a = new Intent(Abecedario.this,P_Comunes.class);
        startActivity(a);



    }
}