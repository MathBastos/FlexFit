package com.example.flexfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class TreinarActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<String> academias;
    private List<Integer> mImagens;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treinar);


        mRecyclerView = findViewById(R.id.recyclerView);

        academias = new ArrayList<>();
        mImagens = new ArrayList<>();


        adapter = new MyAdapter(this, academias, mImagens);

        mImagens.add(R.drawable.beehappy);
        mImagens.add(R.drawable.bodytech);
        mImagens.add(R.drawable.companhiaathletica);
        mImagens.add(R.drawable.gustavoborges);
        mImagens.add(R.drawable.sportbatel);
        mImagens.add(R.drawable.swimex);

        academias.add("Bee Happy");
        academias.add("Bodytech");
        academias.add("Companhia Athletica");
        academias.add("Gustavo Borges");
        academias.add("Sport Batel");
        academias.add("Swimex");

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this ,2, GridLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(gridLayoutManager);
        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.setAdapter(adapter);

    }
}