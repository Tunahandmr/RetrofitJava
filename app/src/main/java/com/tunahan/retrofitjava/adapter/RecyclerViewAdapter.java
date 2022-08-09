package com.tunahan.retrofitjava.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tunahan.retrofitjava.R;
import com.tunahan.retrofitjava.model.CryptoModel;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RowHolder> {

    String[] colors = {"#249C6F","#757315","#661575","#3B64F0","#F03B4E","#EE8C10"};
    private ArrayList<CryptoModel> cryptoList;

    public RecyclerViewAdapter(ArrayList<CryptoModel> cryptoList) {
        this.cryptoList = cryptoList;
    }

    @NonNull
    @Override
    public RowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view= layoutInflater.inflate(R.layout.row_layout,parent,false);
        return new RowHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RowHolder holder, int position) {
        holder.bind(cryptoList.get(position),colors,position);

    }

    @Override
    public int getItemCount() {
        return cryptoList.size();
    }

    public class RowHolder extends RecyclerView.ViewHolder {

        TextView textName;
        TextView textPrice;
        public RowHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(CryptoModel cryptoModel,String[] colors,Integer position){
            itemView.setBackgroundColor(Color.parseColor(colors[position % 6]));
            textName = itemView.findViewById(R.id.currencyText);
            textPrice = itemView.findViewById(R.id.priceText);
            textName.setText(cryptoModel.currency);
            textPrice.setText(cryptoModel.price);

        }
    }
}
