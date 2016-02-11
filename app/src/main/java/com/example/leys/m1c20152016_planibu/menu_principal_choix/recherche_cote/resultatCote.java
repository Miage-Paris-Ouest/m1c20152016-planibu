package com.example.leys.m1c20152016_planibu.menu_principal_choix.recherche_cote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.leys.m1c20152016_planibu.R;
import com.example.leys.m1c20152016_planibu.lireCSV;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class resultatCote extends AppCompatActivity {

    String recherche;
    String salle;
    String etagere;
    String autre;
    String st;
    private List<String[]> scoreList = new ArrayList<String[]>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat_cote);
        TextView tv =(TextView) findViewById(R.id.RechercheSalle);
        TextView tv2 =(TextView) findViewById(R.id.RechercheEtagere);
        TextView tv3 =(TextView) findViewById(R.id.resultatRechercheSalle);
        TextView tv4 =(TextView) findViewById(R.id.resultatRechercheEtagere);

        tv.setText("Salle");
        tv2.setText("Etagere");


        Bundle extras = getIntent().getExtras();
        recherche = extras.getString("recherche");


        InputStream inputStream = getResources().openRawResource(R.raw.databu_shs);
        lireCSV csvFile = new lireCSV(inputStream);
        List <String> scoreList = csvFile.read();

        for (String s : scoreList) {
            if (s.contains(recherche)) {
                st = s.replace("[", "")
                         .replace("]", " ").trim();

                String[] myArray = st.split(",");

                tv3.setText(myArray[0]);
                tv4.setText(myArray[1]);

            }


        }
    }



}
