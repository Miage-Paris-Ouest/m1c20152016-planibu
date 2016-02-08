package com.example.leys.m1c20152016_planibu.menu_principal_choix.selection_par_discipline.salle_droit;

import android.app.Activity;
import android.app.ListFragment;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.leys.m1c20152016_planibu.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragSalleDroit.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragSalleDroit#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragSalleDroit extends ListFragment {
    private OnFragmentInteractionListener mListener;


    public static FragSalleDroit newInstance() {
        FragSalleDroit fragSalleDroit = new FragSalleDroit();
        return fragSalleDroit;
    }

    public FragSalleDroit() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_salle_droit, container, false);
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }



    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        public void onFragmentInteraction(Uri uri);
    }

}
