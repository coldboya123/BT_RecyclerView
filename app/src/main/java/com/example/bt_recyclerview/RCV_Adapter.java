package com.example.bt_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RCV_Adapter extends RecyclerView.Adapter<RCV_Adapter.ViewHolder> {

    Context context;
    List<Object> list;

    public RCV_Adapter(Context context, List<Object> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.rcv_item_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        switch (position) {
            case 0:
                holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false));
                holder.recyclerView.setAdapter(new ItemAdapter(context, list, R.layout.itemview_1_layout));
                break;
            case 1:
                holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, RecyclerView.VERTICAL, false));
                holder.recyclerView.setAdapter(new ItemAdapter(context, list, R.layout.itemview_2_layout));
                break;
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RecyclerView recyclerView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = itemView.findViewById(R.id.rcv);
        }
    }
}
