package com.example.leys.m1c20152016_planibu.menu_principal_choix.selection_par_discipline.salle_ss;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.leys.m1c20152016_planibu.R;

public class SelectionSalleSociale extends AppCompatActivity {
    ListView lvDisciplinesSS;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_salle_sociale);

        lvDisciplinesSS = (ListView) findViewById(R.id.salleSS_listview);
        final String[] tabDisciplinesDeSS = {"Sciences de l'Information", "Psychologie","Sociologie","Ethnologie","Physiologie Sociale","Sciences de l'Education", "Sport", "Histoire des sciences","Médecine"};
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tabDisciplinesDeSS);
        lvDisciplinesSS.setAdapter(adapter);
    }
}
