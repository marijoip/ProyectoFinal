package com.example.proyectofinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class P_Cuerpo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pcuerpo_main);


    }

    public void ColoresIntent(View view) {
        Intent a = new Intent(P_Cuerpo.this,Colores.class);
        startActivity(a);
        finish();
    }

    public void NumerosIntent(View view) {
        Intent a = new Intent(P_Cuerpo.this,Numeros.class);
        startActivity(a);
        finish();
    }

    public void AbecedarioIntent(View view) {
        Intent a = new Intent(P_Cuerpo.this,Abecedario.class);
        startActivity(a);
        finish();
    }

    public void AnimalesIntent(View view) {
        Intent a = new Intent(P_Cuerpo.this,MainActivity.class);
        startActivity(a);
        finish();
    }

    public void PComunesIntent(View view) {
        Intent a = new Intent(P_Cuerpo.this,P_Comunes.class);
        startActivity(a);
        finish();
    }
}
