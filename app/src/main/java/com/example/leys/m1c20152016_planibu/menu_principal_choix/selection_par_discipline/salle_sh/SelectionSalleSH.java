package com.example.leys.m1c20152016_planibu.menu_principal_choix.selection_par_discipline.salle_sh;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.leys.m1c20152016_planibu.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SelectionSalleSH extends AppCompatActivity {
    ListView lvDisciplinesSH;
    ArrayAdapter<String> adapter;
    ExpandableListAdapter listAdapter;
    ExpandableListView expListViewsh;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    ImageView planSSparDisc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_salle_sh);
       /* lvDisciplinesSH = (ListView) findViewById(R.id.salleSH_listview);
        final String[] tabDisciplinesDeSH = {"Philosophie", "Religion","Beaux-Arts","Urbanisme","Art du spectacle","Histoire", "Géographie"};
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tabDisciplinesDeSH);
        lvDisciplinesSH.setAdapter(adapter);*/
        expListViewsh = (ExpandableListView) findViewById(R.id.salleSH_listview);
        prepareListData();

        listAdapter = new com.example.leys.m1c20152016_planibu.menu_principal_choix.selection_par_discipline.ExpandableListAdapter(this, listDataHeader, listDataChild);

        expListViewsh.setAdapter(listAdapter);

        expListViewsh.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        // Listview Group expanded listener
        expListViewsh.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Selectionné",
                        Toast.LENGTH_SHORT).show();
                //switchImgDiscipline();
                switchDataHeaderImg();


            }
        });
        expListViewsh.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Collapsed",
                        Toast.LENGTH_SHORT).show();




            }
        });


        expListViewsh.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                Toast.makeText(
                        getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                listDataHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();
                return false;
            }
        });
    }
    private void switchDataHeaderImg() {
        List<String> si = new ArrayList<String>();
        List<String> psycho = new ArrayList<String>();
        System.out.println("bibibi");

        if (listDataHeader == si) {
            planSSparDisc.setImageResource(R.drawable.planss_si);
        } else if (listDataHeader == psycho) {
            planSSparDisc.setImageResource(R.drawable.planss_psycho);
        } else if (listDataHeader == si) {
            planSSparDisc.setImageResource(R.drawable.planss_socio);
        } else if (listDataHeader == si) {
            planSSparDisc.setImageResource(R.drawable.planss_ethno);
        } else if (listDataHeader == si) {
            planSSparDisc.setImageResource(R.drawable.planss);
        } else if (listDataHeader == si) {
            planSSparDisc.setImageResource(R.drawable.planss_sceduc);
        }
    }


    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Philosophie");
        listDataHeader.add("Religion");
        listDataHeader.add("Beaux-Arts");
        listDataHeader.add("Urbanisme");
        listDataHeader.add("Histoire");
        listDataHeader.add("Géographie");

        // Adding child data
        List<String> philo = new ArrayList<String>();
        philo.add("Métaphysique ");
        philo.add("Ontologie ");
        philo.add("Causalité ");
        philo.add("Liberté ");



        List<String> rg = new ArrayList<String>();
        rg.add("Bible");
        rg.add("Théologie dogmatique");
        rg.add("Théologie morale ");


        List<String> ba= new ArrayList<String>();
        ba.add("Art en général ");
        ba.add("Art des jardins ");
        ba.add("Architecture ");

        List<String> urb = new ArrayList<String>();
        urb.add("2 Guns");
        urb.add("The Smurfs 2");
        urb.add("The Spectacular Now");


        List<String> histo= new ArrayList<String>();
        histo.add("Histoire - dictionnaires ");
        histo.add("Préhistoire ");
        histo.add("Archéologie  ");



        List<String> geo = new ArrayList<String>();
        geo.add("Géographie - Généralités ");
        geo.add("Atlas ");
        geo.add("Géographie générale ");




        listDataChild.put(listDataHeader.get(0), philo); // Header, Child data
        listDataChild.put(listDataHeader.get(1), rg);
        listDataChild.put(listDataHeader.get(2), ba);
        listDataChild.put(listDataHeader.get(3), urb);
        listDataChild.put(listDataHeader.get(4), histo);
        listDataChild.put(listDataHeader.get(5), geo);



    }
}
