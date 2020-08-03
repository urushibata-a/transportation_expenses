package com.example.transportationexpenses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class IcHistoryListAdapter extends RecyclerView.Adapter<IcHistoryListAdapter.ViewHolder> {

    private List<IcHistory> icHistoryList;

    public IcHistoryListAdapter(List<IcHistory> icHistories){
        this.icHistoryList = icHistories;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_ic_history, parent, false);
        return new IcHistoryListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.dateText.setText(icHistoryList.get(position).getDate());
        holder.transportationText.setText(icHistoryList.get(position).getTransportation());
        holder.stationsText.setText(icHistoryList.get(position).getBoardingStation());
        holder.fareText.setText(icHistoryList.get(position).getFare());
    }

    @Override
    public int getItemCount() {
        return icHistoryList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView dateText;
        private TextView transportationText;
        private TextView stationsText;
        private TextView fareText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            dateText = itemView.findViewById(R.id.list_ic_history_date);
            transportationText = itemView.findViewById(R.id.list_ic_history_transportation);
            stationsText = itemView.findViewById(R.id.list_ic_history_stations);
            fareText = itemView.findViewById(R.id.list_ic_history_fare);
        }
    }
}
