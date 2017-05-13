package com.barayuda.sunshine.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.barayuda.sunshine.R;
import com.barayuda.sunshine.model.WeatherItem;
import com.barayuda.sunshine.utilities.SunshineWeatherUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by barayuda on 5/13/17.
 */

public class TodayItemForecastViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.weather_icon)ImageView img;
    @BindView(R.id.date)TextView day;
    @BindView(R.id.weather_description)TextView weatherDesc;
    @BindView(R.id.high_temperature)TextView maxTemp;
    @BindView(R.id.low_temperature)TextView minTemp;

    public TodayItemForecastViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(WeatherItem data) {
        /*day.setText(data.getDay());
        weatherDesc.setText(data.getWeather());
        maxTemp.setText(String.valueOf(data.getMaxTemp()));
        minTemp.setText(String.valueOf(data.getMinTemp()));*/

        img.setImageResource(
                SunshineWeatherUtils
                        .getSmallArtResourceIdForWeatherCondition(
                                data.getWeather().get(0).getId()
                        )
        );

        day.setText(data.getReadableTime(data.getDt()));
        weatherDesc.setText(data.getWeather().get(0).getDescription());
        maxTemp.setText(data.getTemp().getResolvedTemp(data.getTemp().getMax()));
        minTemp.setText(data.getTemp().getResolvedTemp(data.getTemp().getMin()));
    }
}
