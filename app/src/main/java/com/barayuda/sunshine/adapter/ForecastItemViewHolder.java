package com.barayuda.sunshine.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.os.Bundle;

import com.barayuda.sunshine.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by barayuda on 5/7/17.
 */

public class ForecastItemViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.img_weather)


    public ForecastItemViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(itemView);
    }

}
