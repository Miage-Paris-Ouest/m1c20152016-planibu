package com.example.leys.m1c20152016_planibu;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
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

        final String[] tabDisciplines = {"Droit et Science Politique", "Langues et Littérature",
                "Sciences Économiques", "Sciences Humaines", "Sciences Sociales", "La BUlle"};
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tabDisciplines);

        lvDisciplines.setAdapter(adapter);



        lvDisciplines.setOnItemClickListener(new AdapterView.OnItemClickListener()

        {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), SelectionDisciplineDroit.class);
                    startActivity(intent);

                }

                else if (position == 1) {
                    Intent intent = new Intent(SelectionDiscipline.this, SelectionDisciplineLitterature.class);
                    startActivity(intent);

                } else if (position == 2) {
                    Intent intent = new Intent(SelectionDiscipline.this, SelectionDisciplineEco.class);
                    startActivity(intent);

                } else if (position ==3) {
                    Intent intent = new Intent(SelectionDiscipline.this, SelectionDisciplineSH.class);
                    startActivity(intent);

                } else if (position ==4) {
                    Intent intent = new Intent(SelectionDiscipline.this, SelectionDisciplineSociale.class);
                    startActivity(intent);

                } else if (position ==5) {
                    Intent intent = new Intent(SelectionDiscipline.this, SelectionDisciplineBulle.class);
                    startActivity(intent);

                }
            }
        });
    }



    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int posDiscipline = item.getItemId();

        if (posDiscipline == 0) {
            Intent intent = new Intent(SelectionDiscipline.this, SelectionDisciplineDroit.class);
            startActivity(intent);

        }

        else if (posDiscipline == 1) {
            Intent intent = new Intent(SelectionDiscipline.this, SelectionDisciplineLitterature.class);
            startActivity(intent);

        } else if (posDiscipline == 2) {


        } else if (posDiscipline ==3) {
            Intent intent = new Intent(SelectionDiscipline.this, SelectionDisciplineEco.class);
            startActivity(intent);

        } else if (posDiscipline ==4) {
        Intent intent = new Intent(SelectionDiscipline.this, SelectionDisciplineSH.class);
        startActivity(intent);

        } else if (posDiscipline ==5) {
        Intent intent = new Intent(SelectionDiscipline.this, SelectionDisciplineSociale.class);
        startActivity(intent);

        } else if (posDiscipline ==6) {
            Intent intent = new Intent(SelectionDiscipline.this, SelectionDisciplineBulle.class);
            startActivity(intent);

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }




}
