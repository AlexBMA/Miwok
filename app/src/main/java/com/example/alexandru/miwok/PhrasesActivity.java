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

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PhrasesActivity extends AppCompatActivity {

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

        list.add(new Word("Where are you going?", "minto wuksus"));
        list.add(new Word("What is your name?", "tinnә oyaase'nә"));
        list.add(new Word("My name is...", "oyaaset..."));
        list.add(new Word("How are you feeling?", "michәksәs?"));
        list.add(new Word("I’m feeling good.", "kuchi achit"));
        list.add(new Word("Are you coming?", "әәnәs'aa?"));
        list.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        list.add(new Word("I’m coming.", "әәnәm"));
        list.add(new Word("Let’s go.", "yoowutis"));
        list.add(new Word("Come here.", "әnni'nem"));

        return list;
    }

    /**
     * Displays the list  on the screen
     *
     * @param list
     */

    public void displayEnglishWordListAdapter(List<Word> list) {

        WordAdapter itemsAdapter = new WordAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
