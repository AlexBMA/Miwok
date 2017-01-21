package com.example.alexandru.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Alexandru on 1/21/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, List<Word> words) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;
        // Check if the existing view is being reused, otherwise inflate the view
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokWord = (TextView) listItemView.findViewById(R.id.miwok_text_view_1);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        miwokWord.setText(currentWord.getmMiwakTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView englishWord = (TextView) listItemView.findViewById(R.id.default_text_view_2);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        englishWord.setText(currentWord.getmEnglishTranslation());


        return listItemView;

    }
}
