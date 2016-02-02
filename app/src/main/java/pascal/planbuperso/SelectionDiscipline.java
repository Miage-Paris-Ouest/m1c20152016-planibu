package pascal.planbuperso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class SelectionDiscipline extends AppCompatActivity {

    ListView lvDisciplines;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_discipline);


        InputStream inputStream = getResources().openRawResource(R.raw.disciplines);
        lireCSV csvFile = new lireCSV(inputStream);
        List scoreList = csvFile.read();




        lvDisciplines = (ListView) findViewById(R.id.listViewDisciplines);

        String [] tabDisciplines = {"Droit et Science Politique","Langues et Littérature",
                "Sciences Économiques","Sciences Humaines", "Sciences Sociales", "La BUlle"};
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tabDisciplines);

        lvDisciplines.setAdapter(adapter);


    }
}