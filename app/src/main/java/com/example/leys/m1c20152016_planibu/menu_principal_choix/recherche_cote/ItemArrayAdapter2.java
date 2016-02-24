package com.example.leys.m1c20152016_planibu.menu_principal_choix.recherche_cote;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.leys.m1c20152016_planibu.R;

import java.util.ArrayList;
import java.util.List;

public class ItemArrayAdapter2 extends ArrayAdapter<String[]>{

	private List<String[]> scoreList = new ArrayList<String[]>();




	static class ItemViewHolder {
		TextView salle;
		TextView etagere;
		TextView discipline;
		TextView sous_discipline;
		TextView cote;
	}

	public ItemArrayAdapter2(Context context, int resource) {
		super(context, resource);
	}

	public void add(String[] object) {
		scoreList.add(object);
		super.add(object);
	}
	
	@Override
	public int getCount() {
		return this.scoreList.size();
	}
	
	@Override
	public String[] getItem(int position) {
		return this.scoreList.get(position);
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;
		ItemViewHolder viewHolder;
		if(row == null){
			LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			row = inflater.inflate(R.layout.single_list_item2, parent, false);
			viewHolder = new ItemViewHolder();
			viewHolder.salle = (TextView) row.findViewById(R.id.salle);
			viewHolder.etagere = (TextView) row.findViewById(R.id.etagere);
			viewHolder.discipline = (TextView) row.findViewById(R.id.discipline);
			viewHolder.sous_discipline = (TextView) row.findViewById(R.id.sous_discipline);
			viewHolder.cote = (TextView) row.findViewById(R.id.cote);



			row.setTag(viewHolder);
		} else {
			viewHolder = (ItemViewHolder) row.getTag();
		}


		String[] data_csv = getItem(position);
        //String cote = "Cote : " + data_csv[4];
        String etagere = "Etagère : " + data_csv[1];
        String discipline = "Discipline : " + data_csv[2];
        String sousDiscipline = "Sous discipline : " + data_csv[3] ;
        String salle = "Salle : " + data_csv[0];
		//viewHolder.cote.setText(cote);
		viewHolder.etagere.setText(etagere);
		viewHolder.discipline.setText(discipline);
		viewHolder.sous_discipline.setText(sousDiscipline);
		viewHolder.salle.setText(salle);

		return row;
	}
}
