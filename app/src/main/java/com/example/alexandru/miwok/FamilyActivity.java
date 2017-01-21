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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Code here
        List<Word> words = new ArrayList<>();

        words = createEnglishWords(words);
        //displayEnglishWords(englishWords);
        displayEnglishWordListAdapter(words);
    }

    private List<Word> createEnglishWords(List<Word> list) {


        list.add(new Word("father", "әpә"));
        list.add(new Word("mother", "әṭa"));
        list.add(new Word("son", "angsi"));
        list.add(new Word("daughter", "tune"));
        list.add(new Word("older brother", "taachi"));
        list.add(new Word("younger brother", "chalitti"));
        list.add(new Word("older sister", "teṭe"));
        list.add(new Word("younger sister", "kolliti"));
        list.add(new Word("grandmother ", "ama"));
        list.add(new Word("grandfather", "paapa"));


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
