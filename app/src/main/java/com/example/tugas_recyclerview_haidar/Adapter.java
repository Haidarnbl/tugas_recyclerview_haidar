package com.example.tugas_recyclerview_haidar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugas_recyclerview_haidar.databinding.ItemRowListBinding;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.AdapterViewHolder> {

    private ArrayList<DataModel> dataModels;

    public Adapter(ArrayList<DataModel> dataModels) { this.dataModels = dataModels;}

    @NonNull
    @Override
    public Adapter.AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdapterViewHolder(ItemRowListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.AdapterViewHolder holder, int position) {
        DataModel dataModel = dataModels.get(position);
        holder.itemRowListBinding.ivProfile.setImageResource(dataModel.getImage());
        holder.itemRowListBinding.tvNama.setText(dataModel.getNama());
        holder.itemRowListBinding.tvDeskripsi.setText(dataModel.getDeskripsi());
    }

    @Override
    public int getItemCount() {
        return dataModels.size();
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder {

        private ItemRowListBinding itemRowListBinding;
        public AdapterViewHolder(ItemRowListBinding itemRowListBinding) {
            super(itemRowListBinding.getRoot());
            this.itemRowListBinding = itemRowListBinding;
        }
    }
}
