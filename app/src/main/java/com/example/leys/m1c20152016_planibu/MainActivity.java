package com.example.leys.m1c20152016_planibu;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import android.widget.Toast;
import android.app.SearchManager;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.SelectionContact;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.SelectionHoraires;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.SelectionInfoRessources;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.recherche_cote.CsvResultActivity;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.recherche_cote.resultatCote;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.selection_par_discipline.SelectionParDiscipline;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.SelectionParSousDiscipline;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    String recherche;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(toolbar != null) {

            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        MenuItem searchItem= menu.findItem(R.id.action_websearch);

        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);

        if (searchView != null) {
            SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
            searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
            searchView.setIconifiedByDefault(true);

            searchView.setOnQueryTextListener(new OnQueryTextListener(){
                    //this method will call while press (click) search button.


                    @Override
                    public boolean onQueryTextSubmit(String query) {
                        Intent intent = new Intent(MainActivity.this, resultatCote.class);
                        Bundle extras = new Bundle();

                        recherche = query;
                        if (searchView != null) {
                            searchView.setVisibility(View.INVISIBLE);
                            searchView.setVisibility(View.VISIBLE);

                        }

                        extras.putString("recherche", recherche);
                        intent.putExtras(extras);

                        startActivity(intent);


                        return true;
                    }
                @Override
                public boolean onQueryTextChange(String newText) {
                    return false;
                }

            });
        }
        return super.onCreateOptionsMenu(menu);
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
            Intent intent = new Intent(MainActivity.this, SelectionParDiscipline.class);
            startActivity(intent);
        }

        else if (id == R.id.selecSousDiscipline) {
            Intent intent = new Intent(MainActivity.this, SelectionParSousDiscipline.class);
            startActivity(intent);

    }else {
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

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
