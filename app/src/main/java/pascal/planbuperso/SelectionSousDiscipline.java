package pascal.planbuperso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SelectionSousDiscipline extends AppCompatActivity {

    ListView lvDisciplines;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_sous_discipline);
        lvDisciplines = (ListView) findViewById(R.id.listViewDisciplines);

        String [] tabSousDisciplines =
                {"Administration Publiques","Droit","Sciences Politiques",
                        "Archeologique", "Arts du spectacles", "Géographie",
                        "Histoire", "Histoire de l'art", "Philosophie",
                        "Religion", "Anthropologie", "Ethnologie",
                        "Psychologie", "Sciences de l'éducation", "Science et médecine",
                        "Sociologie", "STAPS/Sport", "Economique",
                        "Informatique", "Mathématiques", "Langues",
                        "Lettres", "Sciences du langage"
                };

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tabSousDisciplines);

        lvDisciplines.setAdapter(adapter);


    }
}
