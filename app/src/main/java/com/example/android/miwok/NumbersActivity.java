package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("One", "Lutti",R.drawable.number_one));
        words.add(new Word("Two", "otiiko",R.drawable.number_two));
        words.add(new Word("Three", "tolookosu",R.drawable.number_three));
        words.add(new Word("Four", "oyyisa",R.drawable.number_four));
        words.add(new Word("five", "massokka",R.drawable.number_five));
        words.add(new Word("Six", "temmokka",R.drawable.number_six));
        words.add(new Word("Seven", "Kenekaku",R.drawable.number_seven));
        words.add(new Word("Eight", "Kawinta",R.drawable.number_eight));
        words.add(new Word("Nine", "wo'e",R.drawable.number_nine));
        words.add(new Word("Ten", "naacha",R.drawable.number_ten));

        //ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word> (this, R.layout.list_item, words);

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        /**  LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        int count = 0;
        while(count<numbers.size())
        {
            TextView wordView = new TextView(this);

            wordView.setText(numbers.get(count));

            rootView.addView(wordView);

            count ++;
        }//end while

        for (int index = 0; index<numbers.size(); index++)
        {
            TextView wordView = new TextView(this);

            wordView.setText(numbers.get(index));

            rootView.addView(wordView);
        }//end for

        /**TextView wordView = new TextView(this);

        wordView.setText(numbers.get(0));

        rootView.addView(wordView);

        TextView wordView2 = new TextView(this);

        wordView2.setText(numbers.get(3));

        rootView.addView(wordView2);**/

        /** String[] numberInWords = new String[10];

        numberInWords[0] = "One";
        numberInWords[1] = "Two";
        numberInWords[2] ="Three";
        numberInWords[3] = "Four";
        numberInWords[4] = "Five";
        numberInWords[5] = "Six";
        numberInWords[6] = "Seven";
        numberInWords[7] = "Eight";
        numberInWords[8] = "Nine";
        numberInWords[9] = "Ten";**/
    }//end oncreate
}//end class
