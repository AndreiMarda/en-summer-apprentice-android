//package com.Endava.ticketmanagementapplication;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//import java.util.List;
//
//public class SearchResultAdapter extends RecyclerView.Adapter<SearchResultAdapter.ViewHolder> {
//
//    private List<String> searchResults;
//
//    public SearchResultAdapter(List<String> searchResults) {
//        this.searchResults = searchResults;
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_search_result, parent, false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        String result = searchResults.get(position);
//        holder.textView.setText(result);
//    }
//
//    @Override
//    public int getItemCount() {
//        return searchResults.size();
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//        TextView textView;
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//            textView = itemView.findViewById(R.id.textView);
//        }
//    }
//}