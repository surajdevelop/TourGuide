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
public class EventsFragment extends android.support.v4.app.Fragment {

    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.name_ganpati, R.string.add_ganpati, R.string.fame_ganpati));
        words.add(new Word(R.string.name_ict, R.string.add_ict, R.string.fame_ict
                ));
        words.add(new Word(R.string.name_musical, R.string.add_musical, R.string.fame_musical));
        words.add(new Word(R.string.name_youtube, R.string.add_youtube, R.string.fame_youtube,-1
                ));


        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_phrases);

        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);

        return rootView;
    }

}
