package com.Endava.ticketmanagementapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainPage extends AppCompatActivity {
    private Button eventsButton;
    private Button ordersButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eventsButton = findViewById(R.id.eventsButton);
        eventsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this, EventsPage.class);
                startActivity(intent);
            }
        });

        ordersButton = (Button) findViewById(R.id.ordersButton);
        ordersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this, OrdersPage.class);
                startActivity(intent);
            }
        });
    }
}
