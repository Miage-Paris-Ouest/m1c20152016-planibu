package com.example.leys.m1c20152016_planibu.menu_principal_choix.selection_par_discipline.salle_eco;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.leys.m1c20152016_planibu.R;

public class SelectionSalleEco extends AppCompatActivity {
    ListView lvDisciplinesEco;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_salle_eco);

        lvDisciplinesEco = (ListView) findViewById(R.id.salleEco_listview);

        final String[] tabDisciplinesDeEco = {"Généralités", "Mathématiques","Informatique"};
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tabDisciplinesDeEco);
        lvDisciplinesEco.setAdapter(adapter);
    }
}
