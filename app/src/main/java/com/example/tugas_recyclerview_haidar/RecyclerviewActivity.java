package com.example.tugas_recyclerview_haidar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.tugas_recyclerview_haidar.databinding.ActivityRecyclerviewBinding;

import java.util.ArrayList;
import java.util.Collection;

public class RecyclerviewActivity extends AppCompatActivity {
    private ActivityRecyclerviewBinding binding;
    private ArrayList<DataModel> dataModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRecyclerviewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rvList.setHasFixedSize(true);
        dataModels.addAll(getListData());
        showRecyclerView();
    }
    private void showRecyclerView() {
        binding.rvList.setLayoutManager(new LinearLayoutManager(this));
        Adapter adapter = new Adapter(dataModels);
        binding.rvList.setAdapter(adapter);
    }
    private ArrayList<DataModel> getListData() {
        String[] namalist = {"haidar1","haidar2","haidar3","haidar4","haidar5","haidar6","haidar7","haidar8","haidar9","haidar10"};
        String[] deskripsilist = {"deskripsi1","deskripsi2","deskripsi3","deskripsi4","deskripsi5","deskripsi6","deskripsi7","deskripsi8","deskripsi9","deskripsi10"};
        Integer[] imagelist = {R.drawable.ic_profile,R.drawable.ic_profile,R.drawable.ic_profile,R.drawable.ic_profile,R.drawable.ic_profile,R.drawable.ic_profile,R.drawable.ic_profile,R.drawable.ic_profile,R.drawable.ic_profile,R.drawable.ic_profile};

        ArrayList<DataModel> dataModel = new ArrayList<>();

        for (int i = 0; i < namalist.length; i++){
            DataModel data = new DataModel();
            data.setNama(namalist[i]);
            data.setDeskripsi(deskripsilist[i]);
            data.setImage(imagelist[i]);
            dataModel.add(data);
        }
        return  dataModel;
    }


}