package com.example.leys.m1c20152016_planibu.menu_principal_choix.recherche_cote;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.leys.m1c20152016_planibu.R;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class resultatCote extends AppCompatActivity {

    String recherche;
    String salle;
    String etagere;
    String autre;
    String st;
    private ListView listView;
    private ItemArrayAdapter itemArrayAdapter;
    List<String> listeEtagere = new ArrayList<String>();

    Float Xf;
    Float Yf;

    String Xs;
    String Ys;
    String rowStr = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat_cote);



        Bundle extras = getIntent().getExtras();
        recherche = extras.getString("recherche");
        String label = "Résultat pour la cote " + recherche;

        setTitle(label);


        listView = (ListView) findViewById(R.id.listViewCSV);

        TextView textView = (TextView) findViewById(R.id.csv_title_liste);


        itemArrayAdapter = new ItemArrayAdapter(getApplicationContext(), R.layout.single_list_item);

        Parcelable state = listView.onSaveInstanceState();
        listView.setAdapter(itemArrayAdapter);
        listView.onRestoreInstanceState(state);

        InputStream inputStream = getResources().openRawResource(R.raw.databu_shs);
        CSVReader csv = new CSVReader(inputStream);
        List<String[]> scoreList = csv.read();


        String [] libelle = {"Salle", "Etagere", "Secteur/Discipline", "Sous-Discipline", "Cote"};
        itemArrayAdapter.add(libelle);

        for (String[] scoreData : scoreList) {
            String str = Arrays.asList(scoreData).toString();
            System.out.println("str : " + str);

            for (int i = 0; i<=4; i++) {
                String[] row = str.split(",");
                System.out.println("row :" + row[i]);

                if (i == 4) {

                    if (row[4].startsWith(" " + recherche, 0) ) {

                        System.out.println("startswith : " + row[i]);

                        itemArrayAdapter.add(scoreData);




                        rowStr = row[1];
                        listeEtagere.add(rowStr);

                        // String tvFinale = tv+ recherche;
                        //textView.setText(tvFinale);
                    }

                }
            }


        }

System.out.println("liste etagere : "+ listeEtagere.toString());

String le = listeEtagere.toString().replace(" ","").replace("[","").replace("]","");
        System.out.println("leeee : "+ le);

        if (le.startsWith("0",0)){
            le = le.replace("0","");
        }

        System.out.println("leeee2 : "+ le);

        InputStream inputStream2 = getResources().openRawResource(R.raw.etageres_sh_position);
        CSVReaderPlan csv2 = new CSVReaderPlan(inputStream2);
        List<String[]> scoreList2 = csv2.read();

        for (String[] scoreData : scoreList2) {
            String str2 = Arrays.asList(scoreData).toString();

            System.out.println("strX : " + str2);
            String[] row = str2.split(",");

            for (int i = 0; i<=1; i++) {

                if (row[i].startsWith(" ",0)){
                    row[i] = row[i].replace(" ","");
                }
                System.out.println("startswithY : " + row[i]);

                    if (row[i].startsWith(le, 0) && row[i].equals(le)) {

                        System.out.println("startswithX : " + row[i]);




                        Xs = row[2].replace(" ","");
                        Ys = row[3].replace(" ","");

                        System.out.println("XS : " + row[i]);
                        System.out.println("YS" + row[i]);


                        if (Xs.contains("-")) {

                            Xs = Xs.replace("-",".");
                        }
                        if (Ys.contains("]")) {

                            Ys = Ys.replace("-",".");
                            Ys = Ys.replace("]","");
                        }

                        if (Xs.contains("-")) {
                            Xs = Xs.replace("-",".");

                        }
                            if (Ys.contains("-")) {

                            Ys = Ys.replace("-",".");
                        }
                        Xf = Float.parseFloat(Xs);
                        Yf = Float.parseFloat(Ys);


                                rowStr = row[1];
                        listeEtagere.add(rowStr);

                        // String tvFinale = tv+ recherche;
                        //textView.setText(tvFinale);
                    }


                }
            }





/*

        ImageView iv =  (ImageView) findViewById(R.id.imageView3);

        Bitmap bitMap = Bitmap.createBitmap(100, 130, Bitmap.Config.ARGB_8888);  //creates bmp

        bitMap = bitMap.copy(bitMap.getConfig(), true);     //lets bmp to be mutable

        Canvas canvas = new Canvas(bitMap);                 //draw a canvas in defined bmp

        Paint paint = new Paint();                          //define paint and paint color
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        //paint.setStrokeWidth(0.5f);
        paint.setAntiAlias(true);                           //smooth edges


        iv.setImageBitmap(bitMap);
        //changed set image resource to set image background resource
<<<<<<< Updated upstream
        iv.setBackgroundResource(R.drawable.plansh);
        //canvas.drawCircle(30, 40, 3, paint);
        canvas.drawRect(Xleft,Yup,Xright,Ybottom,paint);
        canvas.drawCircle(Xleft, Ybottom, 3, paint);
        canvas.drawCircle(Xright, Yup, 3, paint);
        //invalidate to update bitmap in imageview
=======
        iv.setBackgroundResource(R.drawable.plansh2);
        canvas.drawCircle(Xf, Yf, 3, paint);



>>>>>>> Stashed changes
        iv.invalidate();


*/




    }
}








