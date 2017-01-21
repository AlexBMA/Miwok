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

public class NumbersActivity extends AppCompatActivity {

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
        list.add(new Word("lutti", "one"));
        list.add(new Word("otiiko", "two"));
        list.add(new Word("tolookosu", "tree"));
        list.add(new Word("oyyisa", "four"));
        list.add(new Word("massokka", "five"));
        list.add(new Word("temmokka", "six"));
        list.add(new Word("kenekaku", "seven"));
        list.add(new Word("kawinta", "eight"));
        list.add(new Word("wo'e", "nine"));
        list.add(new Word("na'aacha", "ten"));


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
