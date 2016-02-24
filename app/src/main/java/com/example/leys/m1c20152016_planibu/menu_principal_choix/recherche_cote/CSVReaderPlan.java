package com.example.leys.m1c20152016_planibu.menu_principal_choix.recherche_cote;

/**
 * Created by Pascal on 24/02/2016.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderPlan {

    InputStream inputStream;
    public CSVReaderPlan(InputStream is) {
        this.inputStream = is;
    }

    public List<String[]> read() throws RuntimeException {
        List<String[]> resultList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        try {
            String csvLine;
            while((csvLine = reader.readLine()) != null) {
                String[] row = csvLine.replace(",", "-").split(";");
                resultList.add(row);
            }
        } catch(IOException ex) {
            throw new RuntimeException("Error in reading CSV file:" + ex);
        } finally {
            try{
                inputStream.close();
            } catch(IOException e) {
                throw new RuntimeException("Error while closing input stream: " + e);
            }
        }

        // test
        return resultList;
    }
}
