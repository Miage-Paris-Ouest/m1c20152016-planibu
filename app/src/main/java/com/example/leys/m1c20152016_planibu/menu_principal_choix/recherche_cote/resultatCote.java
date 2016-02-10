package com.example.leys.m1c20152016_planibu.menu_principal_choix.recherche_cote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.leys.m1c20152016_planibu.R;

public class resultatCote extends AppCompatActivity {

    String recherche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat_cote);
        TextView tv =(TextView) findViewById(R.id.resultatRecherche);


        Bundle extras = getIntent().getExtras();
        recherche = extras.getString("recherche");

        tv.setText(recherche);


    }
}
