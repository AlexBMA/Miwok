/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.alexandru.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;
    /**
     * +     * This listener gets triggered when the {@link MediaPlayer} has completed
     * +     * playing the audio file.
     * +
     */
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            // Now that the sound file has finished playing, release the media player resources.
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Code here
        List<Word> words = new ArrayList<>();

        words = createEnglishMiwokWords(words);
        //displayEnglishWords(englishWords);
        displayEnglishWordListAdapter(words);
    }

    private List<Word> createEnglishMiwokWords(List<Word> list) {

        list.add(new Word("Where are you going?", "minto wuksus", -1, R.raw.phrase_where_are_you_going));
        list.add(new Word("What is your name?", "tinnә oyaase'nә", -1, R.raw.phrase_what_is_your_name));
        list.add(new Word("My name is...", "oyaaset...", -1, R.raw.phrase_my_name_is));
        list.add(new Word("How are you feeling?", "michәksәs?", -1, R.raw.phrase_how_are_you_feeling));
        list.add(new Word("I’m feeling good.", "kuchi achit", -1, R.raw.phrase_im_feeling_good));
        list.add(new Word("Are you coming?", "әәnәs'aa?", -1, R.raw.phrase_are_you_coming));
        list.add(new Word("Yes, I’m coming.", "hәә’ әәnәm", -1, R.raw.phrase_yes_im_coming));
        list.add(new Word("I’m coming.", "әәnәm", -1, R.raw.phrase_im_coming));
        list.add(new Word("Let’s go.", "yoowutis", -1, R.raw.phrase_lets_go));
        list.add(new Word("Come here.", "әnni'nem", -1, R.raw.phrase_come_here));

        return list;
    }

    /**
     * Displays the list  on the screen
     *
     * @param list
     */

    public void displayEnglishWordListAdapter(final List<Word> list) {

        WordAdapter itemsAdapter = new WordAdapter(this, list, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                releaseMediaPlayer();
                Word word = list.get(position);

                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getmIdSound());
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });

        listView.setAdapter(itemsAdapter);
    }

    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
        }
    }
}
