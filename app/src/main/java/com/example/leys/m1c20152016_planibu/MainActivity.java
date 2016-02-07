package com.example.leys.m1c20152016_planibu;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.leys.m1c20152016_planibu.menu_principal_choix.SelectionContact;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.SelectionHoraires;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.SelectionInfoRessources;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.selection_par_discipline.SelectionParDiscipline;
import com.example.leys.m1c20152016_planibu.menu_principal_choix.SelectionParSousDiscipline;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

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

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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

        } else {
            if (id == R.id.selectCote) {


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
