package com.example.leys.m1c20152016_planibu.menu_principal_choix.recherche_cote;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.leys.m1c20152016_planibu.R;

import java.io.InputStream;
import java.util.List;

public class CsvResultActivity extends AppCompatActivity {
    private ListView listView;
    private ItemArrayAdapter itemArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_csv);

        listView = (ListView) findViewById(R.id.listViewCSV);
        itemArrayAdapter = new ItemArrayAdapter(getApplicationContext(), R.layout.single_list_item);

        Parcelable state = listView.onSaveInstanceState();
        listView.setAdapter(itemArrayAdapter);
        listView.onRestoreInstanceState(state);

        InputStream inputStream = getResources().openRawResource(R.raw.databu_shs);
        CSVReader csv = new CSVReader(inputStream);
        List<String[]> scoreList = csv.read();

        for(String [] scoreData : scoreList) {
            itemArrayAdapter.add(scoreData);
        }
    }
}

//Read the file line by line with a BufferedReader wrapped around a FileReader.
// Stop when you hit a line that startsWith the thing you're looking for. Close the reader and return the line.