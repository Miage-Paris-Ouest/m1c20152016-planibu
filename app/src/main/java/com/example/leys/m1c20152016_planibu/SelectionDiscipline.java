package com.example.leys.m1c20152016_planibu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.InputStream;
import java.util.List;

public class SelectionDiscipline extends AppCompatActivity {

    ListView lvDisciplines;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_discipline);






        lvDisciplines = (ListView) findViewById(R.id.listViewDisciplines);

        String [] tabDisciplines = {"Droit et Science Politique","Langues et Littérature",
                "Sciences Économiques","Sciences Humaines", "Sciences Sociales", "La BUlle"};
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tabDisciplines);

        lvDisciplines.setAdapter(adapter);


    }
}
