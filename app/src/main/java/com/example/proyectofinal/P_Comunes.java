package com.example.proyectofinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class P_Comunes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pcomunes_main);

    }

    public void ColoresIntent(View view) {
        Intent a = new Intent(P_Comunes.this,Colores.class);
        startActivity(a);
        finish();
    }

    public void NumerosIntent(View view) {
        Intent a = new Intent(P_Comunes.this,Numeros.class);
        startActivity(a);
        finish();
    }

    public void AbecedarioIntent(View view) {
        Intent a = new Intent(P_Comunes.this,Abecedario.class);
        startActivity(a);
        finish();
    }

    public void pcuerpoIntent(View view) {
        Intent a = new Intent(P_Comunes.this,P_Cuerpo.class);
        startActivity(a);
        finish();
    }

    public void  AnimalesIntent(View view) {
        Intent a = new Intent(P_Comunes.this,MainActivity.class);
        startActivity(a);
        finish();

    }

}

