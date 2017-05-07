package com.barayuda.sunshine.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.os.Bundle;
import android.widget.TextView;

import com.barayuda.sunshine.R;
import com.barayuda.sunshine.model.DummyForecast;

import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by barayuda on 5/7/17.
 */

public class ForecastItemViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.img_weather)ImageView img;
    @BindView(R.id.tv_day)TextView day;
    @BindView(R.id.tv_weather_Desc)TextView weatherDesc;
    @BindView(R.id.tv_maxTemp)TextView maxTemp;
    @BindView(R.id.tv_minTemp)TextView minTemp;


    public ForecastItemViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(itemView);
    }

    public void bind(DummyForecast data) {
        day.setText(data.getDay());
        weatherDesc.setText(data.getWeather());
        maxTemp.setText(data.getMaxTemp());
        minTemp.setText(data.getMinTemp());
    }

}
