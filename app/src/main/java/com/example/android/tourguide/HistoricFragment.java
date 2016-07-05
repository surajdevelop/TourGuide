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
public class HistoricFragment extends android.support.v4.app.Fragment {

    public HistoricFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.name_elephanta, R.string.add_elephanta, R.string.fame_elephanta,
                R.drawable.ic_elephanta));
        words.add(new Word(R.string.name_gateway, R.string.add_gateway, R.string.fame_gateway,
                R.drawable.ic_gateway));
        words.add(new Word(R.string.name_cst, R.string.add_cst, R.string.fame_cst,
                R.drawable.ic_chhatrapati));
        words.add(new Word(R.string.name_kanheri, R.string.add_kanheri, R.string.fame_kanheri,
                R.drawable.ic_caneri));


        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_numbers);

        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);

        return rootView;
    }


}
