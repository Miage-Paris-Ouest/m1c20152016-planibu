package com.example.leys.m1c20152016_planibu.menu_principal_choix.recherche_cote;

import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.leys.m1c20152016_planibu.R;
import com.example.leys.m1c20152016_planibu.lireCSV;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class resultatCote extends AppCompatActivity {

    String recherche;
    String salle;
    String etagere;
    String autre;
    String st;
    private ListView listView;
    private ItemArrayAdapter2 itemArrayAdapter;
    ArrayList<String[]> listeTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat_cote);

        ;


        Bundle extras = getIntent().getExtras();
        recherche = extras.getString("recherche");


        listView = (ListView) findViewById(R.id.listViewCSV);
        itemArrayAdapter = new ItemArrayAdapter2(getApplicationContext(), R.layout.single_list_item2);

        Parcelable state = listView.onSaveInstanceState();
        listView.setAdapter(itemArrayAdapter);
        listView.onRestoreInstanceState(state);

        InputStream inputStream = getResources().openRawResource(R.raw.databu_shs);
        CSVReader csv = new CSVReader(inputStream);
        List<String[]> scoreList = csv.read();

        for (String[] scoreData : scoreList) {
            if (Arrays.asList(scoreData).contains(recherche)) {

                itemArrayAdapter.add(scoreData);
            }
        }

        System.out.println("scoreList : " + scoreList);


    }
}








