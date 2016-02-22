package com.example.leys.m1c20152016_planibu;

import android.annotation.TargetApi;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.leys.m1c20152016_planibu.menu_principal_choix.SelectionContact;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.SelectionHoraires;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.SelectionInfoRessources;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.recherche_cote.CsvResultActivity;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.recherche_cote.resultatCote;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.selection_par_discipline.SelectionParDiscipline;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.SelectionParSousDiscipline;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.selection_par_discipline.salle_sh.SelectionSalleSH;

import static com.example.leys.m1c20152016_planibu.R.drawable.buplanvif;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    String recherche;
    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        setContentView(R.layout.activity_main);

        Switch mySwitch = (Switch) findViewById(R.id.main_switch_service);
        final ImageView planServicesOrNot = (ImageView)findViewById(R.id.main_planServiceOrNot);


//set the switch to ON
        mySwitch.setChecked(false);
        //attach a listener to check for changes in state
        mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked)
                {
                    Toast.makeText(getApplicationContext(),"Services ON",Toast.LENGTH_SHORT).show();
                       planServicesOrNot.setBackground(Drawable.createFromPath("plan_all_services"));
                    planServicesOrNot.setImageResource(R.drawable.buplanvif);


                }else{
                    Toast.makeText(getApplicationContext(),"Services OFF",Toast.LENGTH_SHORT).show();
                    planServicesOrNot.setImageResource(R.drawable.plan_sans_services_vif);


                }

            }

        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setIconifiedByDefault(false);
        searchView.setQueryHint("Recherche par côte");


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                Intent intent = new Intent(MainActivity.this, resultatCote.class);
                Bundle extras = new Bundle();

                recherche = query;

                extras.putString("recherche", recherche);
                intent.putExtras(extras);
                startActivity(intent);


                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                return false;
            }

        });

        return true;
    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }





    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.selecDiscipline) {
            //Intent intent = new Intent(MainActivity.this, SelectionParDiscipline.class);
            //startActivity(intent);
            navigationView.getMenu().clear();
            navigationView.inflateMenu(R.menu.activity_sub_drawer);

        }

        if (id == R.id.retour) {
            //Intent intent = new Intent(MainActivity.this, SelectionParDiscipline.class);
            //startActivity(intent);
            navigationView.getMenu().clear();
            navigationView.inflateMenu(R.menu.activity_main_drawer);
        }

        if (id == R.id.sh) {
            //Intent intent = new Intent(MainActivity.this, SelectionParDiscipline.class);
            //startActivity(intent);
            Intent intent = new Intent(MainActivity.this, SelectionSalleSH.class);
            startActivity(intent);
        }

        else if (id == R.id.selecSousDiscipline) {
            Intent intent = new Intent(MainActivity.this, SelectionParDiscipline.class);
            startActivity(intent);

        } else {
            if (id == R.id.selectCote) {
                Intent intent = new Intent(MainActivity.this, CsvResultActivity.class);
                startActivity(intent);


            } else if (id == R.id.horaires) {
                Intent intent = new Intent(MainActivity.this, SelectionHoraires.class);
                startActivity(intent);
            } else if (id == R.id.inforessources) {
                Intent intent = new Intent(MainActivity.this, SelectionInfoRessources.class);
                startActivity(intent);
            } else if (id == R.id.contact) {
                Intent intent = new Intent(MainActivity.this, SelectionContact.class);
                startActivity(intent);
            }
        }

        return true;
    }
}
