package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listOfClasses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listOfClasses = findViewById(R.id.class_schedule);
        String[] classes = {"CSCI 362", "CSCI 310", "CSCI 340", "CSCI 332", "Art History"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, classes);
        listOfClasses.setAdapter(adapter1);

        listOfClasses.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position,
                                    long l)
            {
                Toast.makeText(getApplicationContext(), "Click", Toast.LENGTH_SHORT).show();
                // String value = (String)adapter.getItemAtPosition(position);
                // assuming string and if you want to get the value on click of list item
                // do what you intend to do on click of listview row
            }
        });

        listOfClasses.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Loooong click", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}