package com.example.nvjscholar.simpletodo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    ArrayList<String> items;
    ArrayAdapter<String> itemsAdapter;
    ListView lvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //obtain a reference to the ListView created with the layout
        lvItems = (ListView) findViewById(R.id.lvItems);
        //initialize the items list
        items = new ArrayList<>();
        //initialize the adapter using the item list
        itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        //wire the adapter to the view
        lvItems.setAdapter(itemsAdapter);

        //add some mock items to the list
        items.add("1st item");
        items.add("2nd items");
    }

    public void onAddItem(View v)
    {
        //obtain a reference to the EditText created with the layout
        EditText etNewItem = (EditText) findViewById(R.id.etNewItem);
        //grab the EditText's content as a String
        String itemText = etNewItem.getText().toString();
        //add the item to the list via the adapter
        itemsAdapter.add(itemText);
        //clear the EditText by setting it to an empty String
        etNewItem.setText(" ");

    }
}
