package com.example.leys.m1c20152016_planibu.menu_principal_choix.selection_par_discipline.salle_litterature;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.leys.m1c20152016_planibu.R;

public class SelectionSalleLitterature extends AppCompatActivity {
    ListView lvDisciplinesLit;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_salle_litterature);
        lvDisciplinesLit = (ListView) findViewById(R.id.salleLit_listview);
        final String[] tabDisciplinesDeLit = {"Langues et littératures orientales", "Latin Grec","Langues et littératures hispaniques","Langues et littératures italiennes","Langues et littératures françaises", "Langues et littératures germaniques", "Langues et littératures anglo- américains","Langues et littératures lusophones", "Langues et littératures roumaines", "Linguistiques"};
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tabDisciplinesDeLit);
        lvDisciplinesLit.setAdapter(adapter);
    }
}
