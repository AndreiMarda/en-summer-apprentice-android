package com.Endava.ticketmanagementapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolder> {
    private List<Events> events;
    private LayoutInflater inflater;

    public EventAdapter(Context context, List<Events> events) {
        this.events = events;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_event, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Events event = events.get(position);
        holder.eventImage.setImageResource(event.getImageResource());
        holder.eventName.setText(event.getName());
        holder.eventDescription.setText(event.getDescription());
        String locationDate = event.getLocation() + ", " + event.getStartDate();
        holder.eventLocationDate.setText(locationDate);
    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView eventImage;
        TextView eventName;
        TextView eventDescription;
        TextView eventLocationDate;

        public ViewHolder(View itemView) {
            super(itemView);
            eventImage = itemView.findViewById(R.id.eventImage);
            eventName = itemView.findViewById(R.id.eventName);
            eventDescription = itemView.findViewById(R.id.eventDescription);
            eventLocationDate = itemView.findViewById(R.id.eventLocationDate);
        }
    }
}
