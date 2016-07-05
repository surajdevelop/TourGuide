package com.example.android.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Neeraj on 6/28/2016.
 */
public class PlacesFragment extends android.support.v4.app.Fragment {

    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.name_marine, R.string.add_marine, R.string.fame_marine));
        words.add(new Word(R.string.name_essel, R.string.add_essel, R.string.fame_essel));
        words.add(new Word(R.string.name_film, R.string.add_film, R.string.fame_film));



        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_colors);

        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);

        return rootView;
    }

}


