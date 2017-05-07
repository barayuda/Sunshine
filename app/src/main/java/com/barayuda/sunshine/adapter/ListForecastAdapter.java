package com.barayuda.sunshine.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.barayuda.sunshine.R;
import com.barayuda.sunshine.model.DummyForecast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by barayuda on 5/7/17.
 */

public class ListForecastAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<DummyForecast> list = new ArrayList<>();

    public ListForecastAdapter(List<DummyForecast> list) {
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ForecastItemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_forecast_item, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ForecastItemViewHolder) holder).bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
