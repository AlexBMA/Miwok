package com.example.alexandru.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Alexandru on 1/21/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Context context, List<Word> words, int colorResourceId) {


        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        this.mColorResourceId = colorResourceId;
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
        final Word currentWord = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID version_name
        ImageView miwokImage = (ImageView) listItemView.findViewById(R.id.img);
        if (currentWord.hasImage()) {

            // set the image using the image id
            miwokImage.setImageResource(currentWord.getmIdImage());


            // set the view visible
            miwokImage.setVisibility(View.VISIBLE);

        } else {
            // make it invisible
            miwokImage.setVisibility(View.GONE);
        }
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokWord = (TextView) listItemView.findViewById(R.id.miwok_text_view_1);

        // set this text on the name TextView
        miwokWord.setText(currentWord.getmMiwakTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView englishWord = (TextView) listItemView.findViewById(R.id.default_text_view_2);

        // set this text on the name TextView
        englishWord.setText(currentWord.getmEnglishTranslation());


        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        //Set the onclick event for the
        textContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create the media player
                MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), currentWord.getmIdSound());
                mediaPlayer.start();
            }
        });




        return listItemView;

    }
}
