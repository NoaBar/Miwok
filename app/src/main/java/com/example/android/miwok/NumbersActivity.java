package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Create an array of words
        ArrayList<String> words = new ArrayList<String>();
        words.add(0, "One");
        words.add(1, "Two");
        words.add(2, "Three");
        words.add(3, "Four");
        words.add(4, "Five");
        words.add(5, "Six");
        words.add(6, "Seven");
        words.add(7, "Eight");
        words.add(8, "Nine");
        words.add(9, "Ten");

        /** ******************************לשאול את טל על this בהקשר הזה
         *
         */

        // Find the root view so we can add child views to it
        LinearLayout numbersRootView = (LinearLayout) findViewById(R.id.numbersRootView);

        TextView wordView = new TextView(this);
        wordView.setText(words.get(0));
        //this line adds the TextView wordView as a child to the LinearLayout numberRootView.
        numbersRootView.addView(wordView);

        for (int index = 1; index < words.size(); index++) {
            // Create a new TextView
            TextView wordViewW = new TextView(this);

            // Set the text to be word at the current index
            wordViewW.setText(words.get(index));

            // Add this TextView as another child to the root view of this layout
            numbersRootView.addView(wordViewW);

        }

    }
}
