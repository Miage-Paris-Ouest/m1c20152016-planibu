package com.example.leys.m1c20152016_planibu.menu_principal_choix.selection_par_discipline.salle_ss;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.leys.m1c20152016_planibu.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SelectionSalleSociale extends AppCompatActivity {
   /* ListView lvDisciplinesSS;
    ArrayAdapter<String> adapter;
    ExpandableListView Exp_list_ss;*/

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    ImageView planSSparDisc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_salle_sociale);

      /*  lvDisciplinesSS = (ListView) findViewById(R.id.explv_ss);
        final String[] tabDisciplinesDeSS = {"Sciences de l'Information", "Psychologie","Sociologie","Ethnologie","Physiologie Sociale","Sciences de l'Education", "Sport", "Histoire des sciences","Médecine"};
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, tabDisciplinesDeSS);
        lvDisciplinesSS.setAdapter(adapter);
*/

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.explv_ss);

        // preparing list data
        prepareListData();

        listAdapter = new com.example.leys.m1c20152016_planibu.menu_principal_choix.selection_par_discipline.ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview Group click listener
        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

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
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Selectionné",
                        Toast.LENGTH_SHORT).show();
                //switchImgDiscipline();
                switchDataHeaderImg();




            }
        });


               // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Collapsed",
                        Toast.LENGTH_SHORT).show();



            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

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
        } else if (listDataHeader == si) {
            planSSparDisc.setImageResource(R.drawable.planss_sport);
        } else if (listDataHeader == si) {
            planSSparDisc.setImageResource(R.drawable.planss_medecine);
        } else if (listDataHeader == si) {
            planSSparDisc.setImageResource(R.drawable.planss_medecine);
        }
    }

    private void switchImgDiscipline() {
        planSSparDisc = (ImageView) findViewById(R.id.salleSS_img);
        System.out.println("abababa");

          expListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
              public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                  System.out.println("blabla");
                  if (position == 0) {
                      planSSparDisc.setImageResource(R.drawable.planss_si);
                  } else if (position == 1) {
                      planSSparDisc.setImageResource(R.drawable.planss_psycho);
                  } else if (position == 2) {
                      planSSparDisc.setImageResource(R.drawable.planss_socio);
                  } else if (position == 3) {
                      planSSparDisc.setImageResource(R.drawable.planss_ethno);
                  } else if (position == 4) {
                      planSSparDisc.setImageResource(R.drawable.planss);
                  } else if (position == 5) {
                      planSSparDisc.setImageResource(R.drawable.planss_sceduc);
                  } else if (position == 6) {
                      planSSparDisc.setImageResource(R.drawable.planss_sport);
                  } else if (position == 7) {
                      planSSparDisc.setImageResource(R.drawable.planss_medecine);
                  } else if (position == 8) {
                      planSSparDisc.setImageResource(R.drawable.planss_medecine);
                  }
              }
          });
    }

    /*
  * Preparing the list data
  */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Sciences de l'Information");
        listDataHeader.add("Psychologie");
        listDataHeader.add("Sociologie");
        listDataHeader.add("Ethnologie");
        listDataHeader.add("Physiologie");
        listDataHeader.add("Sciences de l'Education");
        listDataHeader.add("Sport");
        listDataHeader.add("Histoire des Sciences");
        listDataHeader.add("Medecine");

        // Adding child data
        List<String> si = new ArrayList<String>();
        si.add("Bibliothéconomie ");
        si.add("Ecrits - Edition - Audiovisuel ");
        si.add("Presse et information ");
        si.add("Les journalistes ");


        List<String> psycho = new ArrayList<String>();
        psycho.add("Psychologie - Généralités ");
        psycho.add("Psychophysiologie ");
        psycho.add("Conscience ");
        psycho.add("Perception ");


        List<String> socio = new ArrayList<String>();
        socio.add("2 Guns");
        socio.add("The Smurfs 2");
        socio.add("The Spectacular Now");
        socio.add("The Canyons");
        socio.add("Europa Report");

        List<String> ethno = new ArrayList<String>();
        ethno.add("Mémoires. Récits personnels ");
        ethno.add("Démographie ");
        ethno.add("Socialisme ");
        ethno.add("Cultures et civilisations ");


        List<String> physio = new ArrayList<String>();
        physio.add("2 Guns");
        physio.add("The Smurfs 2");

        List<String> seduc = new ArrayList<String>();
        seduc.add("2 Guns");
        seduc.add("The Smurfs 2");


        List<String> sport = new ArrayList<String>();
        sport.add("2 Guns");
        sport.add("The Smurfs 2");
        sport.add("The Spectacular Now");
        sport.add("The Canyons");
        sport.add("Europa Report");

        List<String> shist = new ArrayList<String>();
        shist.add("Histoire de l’Arctique ");
        shist.add("Histoire de l’Australie ");
        shist.add("Histoire de l’Amérique du Sud ");
        shist.add("Histoire de l’Asie ");


        List<String> medecine = new ArrayList<String>();
        medecine.add("Psychiatrie ");
        medecine.add("Chirurgie ");
        medecine.add("Anatomie ");
        medecine.add("Santé et hygiène ");


        listDataChild.put(listDataHeader.get(0), si); // Header, Child data
        listDataChild.put(listDataHeader.get(1), psycho);
        listDataChild.put(listDataHeader.get(2), ethno);
        listDataChild.put(listDataHeader.get(3), physio);
        listDataChild.put(listDataHeader.get(4), seduc);
        listDataChild.put(listDataHeader.get(5), sport);
        listDataChild.put(listDataHeader.get(6), shist);
        listDataChild.put(listDataHeader.get(7), medecine);
        listDataChild.put(listDataHeader.get(8), socio);

    }




}
