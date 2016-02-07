package com.example.leys.m1c20152016_planibu.menu_principal_choix.selection_par_discipline.salle_droit;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.leys.m1c20152016_planibu.R;

public class SelectionSalleDroit extends AppCompatActivity {
    ListView lvDisciplinesDroit;
    ArrayAdapter<String> adapter;
    Fragment fragDroit;
    Fragment fragScPo;
    Fragment fragSalleDroit;
    int cpt = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_salle_droit);


        lvDisciplinesDroit = (ListView) findViewById(R.id.salleDroit_listview);

        final String[] tabDisciplinesDeDroit = {"Droit", "Sciences Politiques"};
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tabDisciplinesDeDroit);
        lvDisciplinesDroit.setAdapter(adapter);

        /*
        fragSalleDroit = new FragSalleDroit();
        fragDroit = new FragDroit();
        fragScPo = new FragScPo();

        
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.salledroit_fragment_layout_img,fragSalleDroit);
        cpt++;
        ft.commit();

        lvDisciplinesDroit.setOnItemClickListener(new AdapterView.OnItemClickListener()
       {
                 public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 FragmentManager fm = getFragmentManager();
                 FragmentTransaction ft = fm.beginTransaction();

                     if (position == 1) {
                         ft.replace(R.id.salledroit_fragment_layout_img, fragDroit);
                         cpt++;
                     } else if (position == 2)
                     {
                         ft.replace(R.id.salledroit_fragment_layout_img, fragScPo);

                     }

                    /* switch (position) {
                         case 0:
                             ft.replace(R.id.salledroit_fragment_layout_img, fragDroit);
                             lvDisciplinesDroit.setBackgroundColor(Integer.parseInt("#ff2900"));
                             cpt++;
                             break;

                         case 1:
                             ft.replace(R.id.salledroit_fragment_layout_img, fragScPo);
                             lvDisciplinesDroit.setBackgroundColor(Integer.parseInt("#ff2900"));
                             break;
                     } */

                     /*
                     ft.commit();
                       }
                       });
       }
    */

    }
}
