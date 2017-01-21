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
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        // Code here
        List<String> englishWords = new ArrayList<>();
        englishWords = createEndglishWords(englishWords);
        displayEnlishWords(englishWords);

    }

    private List<String> createEndglishWords(List<String> list) {
        list.add("one");
        list.add("two");
        list.add("tree");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");

        return list;
    }

    /**
     * Displays the list in TextViews on the screen
     *
     * @param list
     */

    public void displayEnlishWords(List<String> list) {

        // Get the Linear Layout
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.root_view);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            // Create TextView
            TextView textView = new TextView(this);
            // set text in the textView
            textView.setText(list.get(i));
            // add the TextView to the
            linearLayout.addView(textView);
        }


    }
}
