package com.example.listviewexcercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] StringArray = new String[26];
        for(int i=0; i<26; i++){
            StringArray[i] = Character.toString((char)(i+65));
        }
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.list_view,R.id.t1,StringArray);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}