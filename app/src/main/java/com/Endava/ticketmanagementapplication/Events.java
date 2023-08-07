package com.Endava.ticketmanagementapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

    public class Events extends BaseAdapter{
        private String name;
        private String description;
        private int imageResource;
        private String location;
        private String startDate;

        public Events(String name, String description, int imageResource, String location, String startDate) {
            this.name = name;
            this.description = description;
            this.imageResource = imageResource;
            this.location = location;
            this.startDate = startDate;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public int getImageResource() {
            return imageResource;
        }

        public String getLocation() {
            return location;
        }

        public String getStartDate() {
            return startDate;
        }

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }
    }

