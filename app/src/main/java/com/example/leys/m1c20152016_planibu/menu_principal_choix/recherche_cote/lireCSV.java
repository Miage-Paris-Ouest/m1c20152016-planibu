package com.example.leys.m1c20152016_planibu.menu_principal_choix.recherche_cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Leys on 07/02/2016.
 */
public class lireCSV {
    InputStream inputStream;

    public lireCSV(InputStream inputStream){
        this.inputStream = inputStream;
    }

    public List read(){
        List resultList = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            String csvLine;
            while ((csvLine = reader.readLine()) != null) {
                String[] row = csvLine.split(";");
                resultList.add(Arrays.toString(row));
                System.out.println(Arrays.toString(row));

            }
        }
        catch (IOException ex) {
            throw new RuntimeException("Error in reading CSV file: "+ex);
        }
        finally {
            try {
                inputStream.close();
            }
            catch (IOException e) {
                throw new RuntimeException("Error while closing input stream: "+e);
            }
        }
        return resultList;


        // Pour l'utiliser, mettre ce code dans l'activité qui devra afficher le resultat
        /*InputStream inputStream = getResources().openRawResource("chemin du csv.csv");
        lireCSV csvFile = new lireCSV(inputStream);
        List scoreList = csvFile.read();
        */
    }


}

