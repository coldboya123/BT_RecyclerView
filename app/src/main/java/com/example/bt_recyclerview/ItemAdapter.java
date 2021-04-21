package com.example.bt_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    Context context;
    List<Object> list;
    int layout;

    public ItemAdapter(Context context, List<Object> list, int layout) {
        this.context = context;
        this.list = list;
        this.layout = layout;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Object object = list.get(position);
        holder.img.setImageResource(object.getImg());
        holder.name.setText(object.getName());
        holder.address.setText(object.getAddress());
        holder.voucher.setText(object.getListVoucher().get(0));
        if (object.getListVoucher().size()>1){
            holder.morevoucher.setText("Xem thêm " + (object.getListVoucher().size() - 1) + " ưu đãi khác...");
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView name, address, voucher, morevoucher;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            name = itemView.findViewById(R.id.name);
            address = itemView.findViewById(R.id.address);
            voucher = itemView.findViewById(R.id.voucher);
            morevoucher = itemView.findViewById(R.id.morevoucher);
        }
    }
}
