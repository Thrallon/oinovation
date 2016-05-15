package com.example.thrallon.oinovation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class WineVariety extends AppCompatActivity {

    ListView listView ;
    ArrayAdapter<String> listAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wine_variety_layout);

        listView = (ListView) findViewById(R.id.listview);

        String[] variety = new String[] { "Ασσύρτικο", "Ξυνόμαυρο", "Μοσχοφίλερο", "Αγιωργίτικο",
                "Μαλαγουζιά"};
        ArrayList<String> varietyList = new ArrayList<String>();
        varietyList.addAll( Arrays.asList(variety) );

        listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow,
                R.id.rowTextView, varietyList);

        listView.setAdapter(listAdapter);
    }
}
