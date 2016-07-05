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
public class RestaurantFragment extends android.support.v4.app.Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.name_see, R.string.add_see, R.string.fame_see
        ));
        words.add(new Word(R.string.name_peshawari, R.string.add_peshawari, R.string.fame_peshawari
        ));
        words.add(new Word(R.string.name_romano, R.string.add_romano, R.string.fame_romano));
        words.add(new Word(R.string.name_khyber, R.string.add_khyber, R.string.fame_khyber
        ));


        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_family);

        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);

        return rootView;
    }
}