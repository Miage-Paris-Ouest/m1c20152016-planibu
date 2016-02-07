package com.example.leys.m1c20152016_planibu.menu_principal_choix.selection_par_discipline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.leys.m1c20152016_planibu.R;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.selection_par_discipline.salle_bulle.SelectionSalleBulle;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.selection_par_discipline.salle_droit.SelectionSalleDroit;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.selection_par_discipline.salle_eco.SelectionSalleEco;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.selection_par_discipline.salle_litterature.SelectionSalleLitterature;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.selection_par_discipline.salle_sh.SelectionSalleSH;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.selection_par_discipline.salle_ss.SelectionSalleSociale;

public class SelectionParDiscipline extends AppCompatActivity {

    ListView lvDisciplines;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_discipline);

        lvDisciplines = (ListView) findViewById(R.id.listViewDisciplines);

        final String[] tabDisciplines = {"Droit et Science Politique", "Langues et Littérature",
                "Sciences Économiques", "Sciences Humaines", "Sciences Sociales", "La BUlle"};
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tabDisciplines);

        lvDisciplines.setAdapter(adapter);



        lvDisciplines.setOnItemClickListener(new AdapterView.OnItemClickListener()

        {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), SelectionSalleDroit.class);
                    startActivity(intent);

                } else if (position == 1) {
                    Intent intent = new Intent(SelectionParDiscipline.this, SelectionSalleLitterature.class);
                    startActivity(intent);

                } else if (position == 2) {
                    Intent intent = new Intent(SelectionParDiscipline.this, SelectionSalleEco.class);
                    startActivity(intent);

                } else if (position == 3) {
                    Intent intent = new Intent(SelectionParDiscipline.this, SelectionSalleSH.class);
                    startActivity(intent);

                } else if (position == 4) {
                    Intent intent = new Intent(SelectionParDiscipline.this, SelectionSalleSociale.class);
                    startActivity(intent);

                } else if (position == 5) {
                    Intent intent = new Intent(SelectionParDiscipline.this, SelectionSalleBulle.class);
                    startActivity(intent);

                }
            }
        });
    }



}
