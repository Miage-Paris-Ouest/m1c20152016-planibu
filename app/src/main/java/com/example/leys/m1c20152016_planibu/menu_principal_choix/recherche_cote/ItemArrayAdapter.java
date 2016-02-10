package com.example.leys.m1c20152016_planibu.menu_principal_choix.recherche_cote;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.leys.m1c20152016_planibu.R;

public class ItemArrayAdapter extends ArrayAdapter<String[]>{

	private List<String[]> scoreList = new ArrayList<String[]>();
	
	static class ItemViewHolder {
		TextView salle;
		TextView etagere;
		TextView discipline;
		TextView sous_discipline;
		TextView cote;
	}
	
	public ItemArrayAdapter(Context context, int resource) {
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
			row = inflater.inflate(R.layout.single_list_item, parent, false);
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
		viewHolder.salle.setText(data_csv[0]);
		viewHolder.etagere.setText(data_csv[1]);
		viewHolder.discipline.setText(data_csv[2]);
		viewHolder.sous_discipline.setText(data_csv[3]);
		viewHolder.cote.setText(data_csv[4]);

		return row;
	}
}
