package com.example.leys.m1c20152016_planibu.menu_principal_choix.selection_par_discipline.salle_sh;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.leys.m1c20152016_planibu.R;

public class SelectionSalleSH extends AppCompatActivity {
    ListView lvDisciplinesSH;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_salle_sh);
        lvDisciplinesSH = (ListView) findViewById(R.id.salleSH_listview);
        final String[] tabDisciplinesDeSH = {"Philosophie", "Religion","Beaux-Arts","Urbanisme","Art du spectacle","Histoire", "Géographie"};
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tabDisciplinesDeSH);
        lvDisciplinesSH.setAdapter(adapter);
    }
}
