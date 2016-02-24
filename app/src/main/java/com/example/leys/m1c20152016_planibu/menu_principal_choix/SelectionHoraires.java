package com.example.leys.m1c20152016_planibu.menu_principal_choix;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.leys.m1c20152016_planibu.R;

import java.util.ArrayList;
import java.util.List;

public class SelectionHoraires extends AppCompatActivity {
    private List<Horaire> mesHoraires = new ArrayList<>();
    ArrayAdapter<Horaire> myAdapt;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_horaires);

        //Creation des contacts
        mesHoraires.add(new Horaire("Lundi ", "8h30 - 20h"));
        mesHoraires.add(new Horaire("Mardi ", "8h30 - 20h"));
        mesHoraires.add(new Horaire("Mercredi ", "8h30 - 20h"));
        mesHoraires.add(new Horaire("Jeudi ", "8h30 - 20h"));
        mesHoraires.add(new Horaire("Vendredi ", "8h30 - 20h"));
        mesHoraires.add(new Horaire("Samedi ", "10h - 18h"));


        ListView list = (ListView) findViewById(R.id.listHoraires);
        myAdapt = new MyAdapterHoraire(getBaseContext(), R.layout.layout_listhoraires);
        list.setAdapter(myAdapt);

        registerForContextMenu(list);
    }

    private class Horaire {
        public String j;
        public String h;

        public Horaire(String j, String h) {
            this.j=j;
            this.h=h;
        }
    }


    private class MyAdapterHoraire extends ArrayAdapter<Horaire> {
        public MyAdapterHoraire(Context context, int resource) {
            super(context, resource, mesHoraires);
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = convertView;
            if (view == null) {
                view = getLayoutInflater().inflate(R.layout.layout_listhoraires, parent, false);
            }
            // Find the car to work with.
            Horaire currentH = mesHoraires.get(position);


           /* ImageView imageView = (ImageView) view.findViewById(R.id.layoutlistsimple_imageView_picture);
            if (position % 2 == 1) {
                view.setBackgroundColor(Color.argb(255, 167, 255, 202));

                //imageView.setImageResource(currentContact.idPic);
            } else {
                view.setBackgroundColor(Color.argb(255,255,124,123));
                //imageView.setImageResource(0);
            }
            imageView.setImageResource(currentContact.idPic);*/

            TextView tvJours = (TextView) view.findViewById(R.id.layoutlistHoraires_jours);
            tvJours.setText(currentH.j);

            TextView tvHeures = (TextView) view.findViewById(R.id.layoutlistHoraires_heures);
            tvHeures.setText(currentH.h);

           return view;
        }
    }

}
