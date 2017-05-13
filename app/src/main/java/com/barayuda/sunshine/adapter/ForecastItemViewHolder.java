package com.barayuda.sunshine.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.os.Bundle;
import android.widget.TextView;

import com.barayuda.sunshine.R;
import com.barayuda.sunshine.model.DailyForecast;
import com.barayuda.sunshine.model.DummyForecast;
import com.barayuda.sunshine.model.WeatherItem;

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
        ButterKnife.bind(this, itemView);
    }

    public void bind(WeatherItem data) {
        /*day.setText(data.getDay());
        weatherDesc.setText(data.getWeather());
        maxTemp.setText(String.valueOf(data.getMaxTemp()));
        minTemp.setText(String.valueOf(data.getMinTemp()));*/
        day.setText("Sunday");
        weatherDesc.setText(data.getWeather().get(0).getDescription());
        maxTemp.setText(data.getTemp().getResolvedTemp(data.getTemp().getMax()));
        minTemp.setText(data.getTemp().getResolvedTemp(data.getTemp().getMin()));
    }

}
