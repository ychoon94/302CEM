package com.example.smileyrestaurant;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    List<OrderPlaced> orderPlacedList;
    Context context;


    public RecyclerViewAdapter(List<OrderPlaced> orderPlacedList, Context context) {
        this.orderPlacedList = orderPlacedList;
        this.context = context;
    }

    public RecyclerViewAdapter(List<OrderPlaced> orderPlacedList) {
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.kitchen_list_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.timeOrdered.setText(orderPlacedList.get(position).getTimeOrdered());
        holder.tableNum.setText(String.valueOf(orderPlacedList.get(position).getTableNo()));
        holder.totalPlaced.setText(String.valueOf(orderPlacedList.get(position).getTotalNoPlaced()));
        holder.itemQuantity.setText(String.valueOf(orderPlacedList.get(position).getTotalPlacedQuantity()));
        holder.foodItem.setText(orderPlacedList.get(position).getFoodItem());
    }

    @Override
    public int getItemCount() {
        return orderPlacedList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView listBackground;
        ImageView btnReady;
        TextView readyText;
        TextView timeOrdered;
        TextView tableNum;
        TextView tableNoText;
        TextView dividingLine;
        TextView totalPlacedText;
        TextView totalPlaced;
        TextView itemQuantity;
        TextView foodItem;
        TextView symbolX;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            listBackground = itemView.findViewById(R.id.list_background);
            btnReady = itemView.findViewById(R.id.btn_ready);
            readyText = itemView.findViewById(R.id.ready_text);
            timeOrdered = itemView.findViewById(R.id.time_ordered);
            tableNum = itemView.findViewById(R.id.table_num);
            tableNoText = itemView.findViewById(R.id.table_no_text);
            dividingLine = itemView.findViewById(R.id.dividing_line);
            totalPlacedText = itemView.findViewById(R.id.total_placed_text);
            totalPlaced = itemView.findViewById(R.id.totalNoPlaced);
            itemQuantity = itemView.findViewById(R.id.item_quantity);
            foodItem = itemView.findViewById(R.id.food_item);
            symbolX = itemView.findViewById(R.id.symbol_x);
        }
    }
}
