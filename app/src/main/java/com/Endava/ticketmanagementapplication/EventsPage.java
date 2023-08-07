package com.Endava.ticketmanagementapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

public class EventsPage extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EventAdapter eventAdapter;
    private List<Events> eventList;
    private Button backButton;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

//        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if (checkedId == R.id.radioStandardUntold) {
//                    // Handle Option 1 selection
//                } else if (checkedId == R.id.radioVIPUntold) {
//                    // Handle Option 2 selection
//                }
//            }
//        });

//        getSupportActionBar().setTitle("Events");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
//        recyclerView = findViewById(R.id.recyclerView);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        eventList = new ArrayList<>();
//        // Add some sample events to the list
//        eventList.add(new Events("Event 1", "This is event 1", R.drawable.untold, "Location 1", "2023-08-15"));
//        eventList.add(new Events("Event 2", "This is event 2", R.drawable.ec, "Location 2", "2023-09-01"));
//        // Add more events as needed
//
//        eventAdapter = new EventAdapter(this, eventList);
//        recyclerView.setAdapter(eventAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        MenuItem searchItem = menu.findItem(R.id.menu_search);

        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
//                performSearch(query);
                return true;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                // Handle search query text change
                // You can perform live search filtering here
                return true;
            }
        });
        return true;
    }
//
//    private void performSearch(String query) {
//        List<String> searchResults = new ArrayList<>(); // Replace with your data source
//
//        // Dummy logic to populate searchResults
//        for (int i = 0; i < 10; i++) {
//            searchResults.add("Result " + i);
//        }
//
//        RecyclerView searchRecyclerView = findViewById(R.id.searchRecyclerView); // Replace with your RecyclerView's ID
//        SearchResultAdapter adapter = new SearchResultAdapter(searchResults);
//        searchRecyclerView.setAdapter(adapter);
//    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.menu_search) {


            return true;
        } else if (itemId == R.id.menu_home) {
            Intent intent = new Intent(EventsPage.this, MainPage.class);
            startActivity(intent);
            return true;
        } else if (itemId == R.id.menu_sort) {


            return true;
        } else if (itemId == R.id.exit) {
            finish();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

}
