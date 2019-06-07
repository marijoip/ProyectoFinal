package com.example.proyectofinal;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    ImageButton pena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pena = (ImageButton) findViewById(R.id.crack);
        mp=MediaPlayer.create(this, R.raw.amarillo);
        pena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
    }

    public void ColoresIntent(View view) {
        Intent a = new Intent(MainActivity.this,Colores.class);
        startActivity(a);

    }

    public void NumerosIntent(View view) {
        Intent a = new Intent(MainActivity.this,Numeros.class);
        startActivity(a);

    }

    public void AbecedarioIntent(View view) {
        Intent a = new Intent(MainActivity.this,Abecedario.class);
        startActivity(a);

    }

    public void pcuerpoIntent(View view) {
        Intent a = new Intent(MainActivity.this,P_Cuerpo.class);
        startActivity(a);

    }

    public void  PComunesIntent(View view) {
        Intent a = new Intent(MainActivity.this,P_Comunes.class);
        startActivity(a);


    }

}



